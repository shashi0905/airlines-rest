package com.shashi.demo.airlinesrest.model;

public class Flight {
	
	private String fno;
	private String source;
	private String destination;
	
	public Flight(String fno, String source, String destination) {
		super();
		this.fno = fno;
		this.source = source;
		this.destination = destination;
	}

	public String getFno() {
		return fno;
	}

	public void setFno(String fno) {
		this.fno = fno;
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
