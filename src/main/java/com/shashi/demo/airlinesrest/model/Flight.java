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

	public String getFno() {
		return flightNumber;
	}

	public void setFno(String flightNumber) {
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
