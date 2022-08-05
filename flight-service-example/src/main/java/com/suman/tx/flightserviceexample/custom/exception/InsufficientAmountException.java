package com.suman.tx.flightserviceexample.custom.exception;

import org.springframework.stereotype.Component;

@Component
public class InsufficientAmountException extends RuntimeException{

//	public InsufficientAmountException(String msg) {
//		super(msg);
//	}
	
	private String errorCode;
	private String errorMsg;
	private static final long serialVersionUID = 1L;
	
	
	public InsufficientAmountException() {
		
	}
	
	public InsufficientAmountException(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public InsufficientAmountException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public InsufficientAmountException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public InsufficientAmountException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public InsufficientAmountException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
