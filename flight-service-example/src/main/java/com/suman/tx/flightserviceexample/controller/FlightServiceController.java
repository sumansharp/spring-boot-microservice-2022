package com.suman.tx.flightserviceexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suman.tx.flightserviceexample.dto.FlightBookingAcknowledgement;
import com.suman.tx.flightserviceexample.dto.FlightBookingRequest;
import com.suman.tx.flightserviceexample.service.FlightBookingService;

@RestController
@EnableTransactionManagement
public class FlightServiceController {

	
	@Autowired(required=true)
	private FlightBookingService service;
	
	@PostMapping("/bookFlightTicket")
	//@PostMapping(path = "/bookFlightTicket", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	//@RequestMapping(path = "/bookFlightTicket", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
		return service.bookFlightTicket(request);
	}
}
