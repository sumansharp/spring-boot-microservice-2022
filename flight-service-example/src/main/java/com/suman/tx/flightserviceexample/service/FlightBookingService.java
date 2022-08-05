package com.suman.tx.flightserviceexample.service;

import org.springframework.stereotype.Service;

import com.suman.tx.flightserviceexample.dto.FlightBookingAcknowledgement;
import com.suman.tx.flightserviceexample.dto.FlightBookingRequest;


public interface FlightBookingService {
	
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request);

}
