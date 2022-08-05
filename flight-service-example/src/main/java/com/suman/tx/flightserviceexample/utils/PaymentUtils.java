package com.suman.tx.flightserviceexample.utils;

import java.util.HashMap;
import java.util.Map;

import com.suman.tx.flightserviceexample.custom.exception.InsufficientAmountException;

public class PaymentUtils {
	private static Map<String, Double> paymentMap=new HashMap<String, Double>();
		
		static {
		paymentMap.put("acc1", 12000.0);
		paymentMap.put("acc02", 10000.0);
		paymentMap.put("acc3", 8000.0);
		paymentMap.put("acc4", 5000.0);
		
		}
		
	public static boolean validateCreditLimit(String accNo, double paidAmt) {
		if(paidAmt>paymentMap.get(accNo)) {
			throw new InsufficientAmountException("Insufficient Fund...!");
		}else {
			return true;
		}
		
	}
	
}
