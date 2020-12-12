package com.shashi.demo.airlinesrest.model;

public class Flight {
	
	private String flightNumber;
	private String source;
	private String destination;
	
	public Flight(String flightNumber, String source, String destination) {
		super();
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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

	public void setDestination(String destination) {
		this.destination = destination;
	}
}
