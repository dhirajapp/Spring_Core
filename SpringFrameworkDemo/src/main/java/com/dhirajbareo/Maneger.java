package com.dhirajbareo;

public class Maneger implements Employee{
	
	private String band; 

	public Maneger(String band) {
		this.band = band;
	}

	public String getBand() {

		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public void assist() {
		System.out.println("Maneger is assisting");
	}
}
