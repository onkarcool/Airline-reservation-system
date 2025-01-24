package com.airlinereservation.dto;

import java.util.ArrayList;
import java.util.List;

import com.airlinereservation.entity.Airport;

import lombok.Data;

@Data
public class AirportResponseDto extends CommonApiResponse {

	private List<Airport> airports = new ArrayList<>();

	public List<Airport> getAirports() {
		return airports;
	}

	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}
	
	
}
