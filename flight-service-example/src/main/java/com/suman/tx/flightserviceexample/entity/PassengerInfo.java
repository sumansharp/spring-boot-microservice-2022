package com.suman.tx.flightserviceexample.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PASSANGER_INFO")
public class PassengerInfo {
	
	@Id
	@GeneratedValue(generator="id_seq")
	private Integer pId;
	private String name;
	private String email;
	private String source;
	private String destination;
	//@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-mm-dd" )
	private Date travelDate;
	private String departureTime;
	private String arrivalTime;
	private double fare;
	
	public PassengerInfo(Integer pId, String name, String email, String source, String description, Date travelDate,
			String departureTime, String arrivalTime, double fare) {
		super();
		this.pId = pId;
		this.name = name;
		this.email = email;
		this.source = source;
		this.destination = description;
		this.travelDate = travelDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String dest) {
		this.destination = dest;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "PassengerInfo [pId=" + pId + ", name=" + name + ", email=" + email + ", source=" + source
				+ ", destination=" + destination + ", travelDate=" + travelDate + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", fare=" + fare + "]";
	}
	

}
