package com.suman.tx.flightserviceexample.advice;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.suman.tx.flightserviceexample.custom.exception.EmptyInputException;
import com.suman.tx.flightserviceexample.custom.exception.InsufficientAmountException;
//youtube: https://www.youtube.com/watch?v=hLlGAQ5NfTE

@ControllerAdvice  // it handle exceptions globally
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {

	//ResponseEntityExceptionHandler handleResponse;
	
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException){
		
		return new ResponseEntity<String>("Input field is empty, please fill it resubmit again",HttpStatus.BAD_REQUEST );
	}
	
	@ExceptionHandler(InsufficientAmountException.class)
	public ResponseEntity<String> valdateCreditLimit(InsufficientAmountException insufficientAmountException){
		return new ResponseEntity<String>("User have Insufficient Fund to book the ticket..!", HttpStatus.BAD_REQUEST);
	}
	

	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleNullPointerException(NullPointerException nullPointerException){
		
		if(nullPointerException.getMessage().equalsIgnoreCase("Cannot invoke \""+"java.lang.Double.doubleValue()\""+" because the return value of \""+"java.util.Map.get(Object)\""+" is null")) {
			return new ResponseEntity<String>("Please check if Account Number is correct", HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<String>(nullPointerException.getMessage(), HttpStatus.BAD_REQUEST);
			
		}
			
	}
	
	//We can extends ResponseEntityExceptionHandler Class and Overrirde it's predefine funtions too.
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(
			HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request){
		return new ResponseEntity<Object>("Request URL is not Correct Please check with Service Provider..!", HttpStatus.BAD_REQUEST);
		
	}
	
}
