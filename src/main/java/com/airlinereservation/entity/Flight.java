package com.airlinereservation.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String flightNumber;
	
	private String departureTime;
	
	private String arrivalTime;
	
	private String status; // Scheduled, On Time, Delayed, etc.

	@ManyToOne
	@JoinColumn(name = "departure_airport_id")
	private Airport departureAirport;

	@ManyToOne
	@JoinColumn(name = "arrival_airport_id")
	private Airport arrivalAirport;

	@ManyToOne
	@JoinColumn(name = "airplane_id")
	private Airplane airplane;
	
	private BigDecimal economySeatFare;
	
	private BigDecimal businessSeatFare;
	
	private BigDecimal firstClassSeatFare;
	
	
	// from Airplane Entity
    private int totalSeat;
    
    private int economySeats;
	
    private int businessSeats;
    
    private int firstClassSeats;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Airport getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
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

	public int getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	public int getEconomySeats() {
		return economySeats;
	}

	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}

	public int getBusinessSeats() {
		return businessSeats;
	}

	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}

	public int getFirstClassSeats() {
		return firstClassSeats;
	}

	public void setFirstClassSeats(int firstClassSeats) {
		this.firstClassSeats = firstClassSeats;
	}
	

}
