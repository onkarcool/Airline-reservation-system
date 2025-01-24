package com.airlinereservation.dto;

import lombok.Data;

@Data
public class FlightUpdateStatusRequestDto {
	
	private int flightId;
	
	private String status;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
