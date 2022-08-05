package com.suman.tx.flightserviceexample.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.tx.flightserviceexample.custom.exception.EmptyInputException;
import com.suman.tx.flightserviceexample.dto.FlightBookingAcknowledgement;
import com.suman.tx.flightserviceexample.dto.FlightBookingRequest;
import com.suman.tx.flightserviceexample.entity.PassengerInfo;
import com.suman.tx.flightserviceexample.entity.PaymentInfo;
import com.suman.tx.flightserviceexample.repository.PassengerInfoRepository;
import com.suman.tx.flightserviceexample.repository.PaymentInfoRepository;
import com.suman.tx.flightserviceexample.utils.PaymentUtils;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {
	public static Logger log= LoggerFactory.getLogger(FlightBookingServiceImpl.class);
			
	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;

	@Override
	@Transactional
	//@Transactional(readOnly=false,isolation=Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
		
		PassengerInfo passengerInfo=request.getPassengerInfo();
		passengerInfo=passengerInfoRepository.save(passengerInfo);
		
		log.info("PASSENGER INFO:"+passengerInfo.getDestination()+" , "+passengerInfo.getDepartureTime());
		
		PaymentInfo paymentInfo= request.getPaymentInfo();
		//paymentInfo = paymentInfoRepository.save(paymentInfo);
		
		if(passengerInfo.getName().isEmpty() || passengerInfo.getSource().isEmpty()) {
			throw new EmptyInputException("601", "Passanger Name or source is Empty!!");
		}
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());
		
		paymentInfo.setPassengerId(passengerInfo.getpId());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepository.save(paymentInfo);
		
		String msg="Success!!";
		String pnr=UUID.randomUUID().toString().split("-")[0];
		double fare=passengerInfo.getFare();
		log.info("RETURNING VALUE:");
		log.info("PNR NO: "+pnr);
		log.info("FARE: "+fare);
		log.info("PASSANGER INFORMATION: "+passengerInfo);
		return new FlightBookingAcknowledgement(msg,fare,pnr,passengerInfo);
		//return new FlightBookingAcknowledgement("Success",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0], passengerInfo);
		
		
		
		
	}

}
