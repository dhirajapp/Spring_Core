package com.dhirajbareo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(scopeName="prototype")   // Bean scope  
public class SeniorSoftwareEngineer implements Employee,BeanNameAware{

	
	private String band; 

	@Override
	public String toString() {
		return "SeniorSoftwareEngineer [band=" + band + "]";
	}

	public String getBand() {

		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}
	
	
	
	public void assist() {
		System.out.println("Senior Software Engineer is assisting");
	}

	public void setBeanName(String name) {
		System.out.println("Set Bean name method is called ");
		
	}
}
