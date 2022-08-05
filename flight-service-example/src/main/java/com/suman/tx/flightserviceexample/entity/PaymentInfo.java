package com.suman.tx.flightserviceexample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PAYMENT_INFO")
public class PaymentInfo {
	@Id
	@GeneratedValue(generator ="uuid")
	//@GenericGenerator(name="uuid", strategy ="org.hiberante.id.UUIDGenerator" )
	private Integer paymentId;
	private String accountNo;
	private double amount;
	private String cardType;
	private Integer passengerId;
	
	
	public PaymentInfo(Integer paymentId, String accountNo, double amount, String cardType, Integer passengerId) {
		super();
		this.paymentId = paymentId;
		this.accountNo = accountNo;
		this.amount = amount;
		this.cardType = cardType;
		this.passengerId = passengerId;
	}
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Integer getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Integer long1) {
		this.passengerId = long1;
	}
	@Override
	public String toString() {
		return "PaymentInfo [paymentId=" + paymentId + ", accountNo=" + accountNo + ", amount=" + amount + ", cardType="
				+ cardType + ", passengerId=" + passengerId + "]";
	}
	
}
