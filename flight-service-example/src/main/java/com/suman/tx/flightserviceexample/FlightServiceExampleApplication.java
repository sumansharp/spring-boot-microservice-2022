package com.suman.tx.flightserviceexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suman.tx.flightserviceexample.dto.FlightBookingAcknowledgement;
import com.suman.tx.flightserviceexample.dto.FlightBookingRequest;
import com.suman.tx.flightserviceexample.service.FlightBookingService;
import com.suman.tx.flightserviceexample.service.FlightBookingServiceImpl;

//   https://www.youtube.com/watch?v=95kxPSbHzVg

@SpringBootApplication
public class FlightServiceExampleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FlightServiceExampleApplication.class, args);
	}

}
