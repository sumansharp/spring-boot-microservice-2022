package com.suman.tx.flightserviceexample.dto;

import com.suman.tx.flightserviceexample.entity.PassengerInfo;
import com.suman.tx.flightserviceexample.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class FlightBookingRequest {
	
	private PassengerInfo passengerInfo;
	
	private PaymentInfo paymentInfo;

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	
}
