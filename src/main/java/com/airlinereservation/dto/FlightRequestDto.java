package com.airlinereservation.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class FlightRequestDto {
	
	private String departureTime;
	
	private String arrivalTime;
	
	private String status; // Scheduled, On Time, Delayed, etc.

	private int departureAirportId;

	private int arrivalAirportId;

	private int airplaneId;
	
    private BigDecimal economySeatFare;
	
	private BigDecimal businessSeatFare;
	
	private BigDecimal firstClassSeatFare;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getDepartureAirportId() {
		return departureAirportId;
	}

	public void setDepartureAirportId(int departureAirportId) {
		this.departureAirportId = departureAirportId;
	}

	public int getArrivalAirportId() {
		return arrivalAirportId;
	}

	public void setArrivalAirportId(int arrivalAirportId) {
		this.arrivalAirportId = arrivalAirportId;
	}

	public int getAirplaneId() {
		return airplaneId;
	}

	public void setAirplaneId(int airplaneId) {
		this.airplaneId = airplaneId;
	}

	public BigDecimal getEconomySeatFare() {
		return economySeatFare;
	}

	public void setEconomySeatFare(BigDecimal economySeatFare) {
		this.economySeatFare = economySeatFare;
	}

	public BigDecimal getBusinessSeatFare() {
		return businessSeatFare;
	}

	public void setBusinessSeatFare(BigDecimal businessSeatFare) {
		this.businessSeatFare = businessSeatFare;
	}

	public BigDecimal getFirstClassSeatFare() {
		return firstClassSeatFare;
	}

	public void setFirstClassSeatFare(BigDecimal firstClassSeatFare) {
		this.firstClassSeatFare = firstClassSeatFare;
	}
	

}
