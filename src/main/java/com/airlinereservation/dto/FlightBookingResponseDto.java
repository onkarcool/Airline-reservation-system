package com.airlinereservation.dto;

import java.util.ArrayList;
import java.util.List;

import com.airlinereservation.entity.FlightBooking;

import lombok.Data;

@Data
public class FlightBookingResponseDto extends CommonApiResponse {
	
	private List<FlightBooking> bookings = new ArrayList<>();

	public List<FlightBooking> getBookings() {
		return bookings;
	}

	public void setBookings(List<FlightBooking> bookings) {
		this.bookings = bookings;
	}
	

}
