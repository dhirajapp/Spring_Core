package com.dhirajbareo;

public class TechLead implements Employee {

	 
	private String band; 

	public String getBand() {

		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public void assist() {
		System.out.println("Tech lead is assisting");
	}

}
