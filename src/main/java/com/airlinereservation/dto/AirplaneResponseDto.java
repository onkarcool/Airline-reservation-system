package com.airlinereservation.dto;

import java.util.ArrayList;
import java.util.List;

import com.airlinereservation.entity.Airplane;

import lombok.Data;

@Data
public class AirplaneResponseDto extends CommonApiResponse {
	
	private List<Airplane> airplanes = new ArrayList<>();

	public List<Airplane> getAirplanes() {
		return airplanes;
	}

	public void setAirplanes(List<Airplane> airplanes) {
		this.airplanes = airplanes;
	}

	
	

}
