package com.airlinereservation.dto;

import lombok.Data;

@Data
public class FlightBookingRequestDto {
	
    private int totalPassengers;
    
    private String flightClassType;
    
    private int passengerId;

    private int flightId;

	public int getTotalPassengers() {
		return totalPassengers;
	}

	public void setTotalPassengers(int totalPassengers) {
		this.totalPassengers = totalPassengers;
	}

	public String getFlightClassType() {
		return flightClassType;
	}

	public void setFlightClassType(String flightClassType) {
		this.flightClassType = flightClassType;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
    

}
