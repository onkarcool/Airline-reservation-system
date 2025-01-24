package com.airlinereservation.dto;

import java.util.ArrayList;
import java.util.List;

import com.airlinereservation.entity.Flight;
import com.airlinereservation.entity.FlightBooking;

import lombok.Data;

@Data
public class FlightResponseDto extends CommonApiResponse {
	
	private List<Flight> flights = new ArrayList<>();
	
	private List<FlightBooking> flightBookings = new ArrayList<>();

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public List<FlightBooking> getFlightBookings() {
		return flightBookings;
	}

	public void setFlightBookings(List<FlightBooking> flightBookings) {
		this.flightBookings = flightBookings;
	}
	

}
