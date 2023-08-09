package com.dhirajbareo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkDemo {

	public static void main(String[] args) {
		// tightly coupled
		/* 
		 * TechLead tl=new TechLead(); tl.assist();
		 */
		
		// lossely coupling
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		TechLead tl=context.getBean(TechLead.class);
		Maneger maneger=(Maneger)context.getBean("maneger");
		tl.assist();
		maneger.assist();
		
		Employee emp1=context.getBean(TechLead.class);
		emp1.assist();
		System.out.println(((TechLead)emp1).getBand());
		
		Employee emp2=context.getBean(Maneger.class);
		emp2.assist();
		System.out.println(((Maneger) emp2).getBand());
		
		Employee emp3=context.getBean(SeniorSoftwareEngineer.class);
		emp3.assist();
		
	}

}
