package com.dhirajbareo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkDemo {

	public static void main(String[] args) {
		// tightly coupled
		/* 
		 * TechLead tl=new TechLead(); tl.assist();
		 */
		
		// lossely coupling
		
		// xml based
	
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
		
		// Configrataion 
				ApplicationContext context1=new AnnotationConfigApplicationContext(BeanConfig.class);
		
		Employee emp3=context1.getBean(SeniorSoftwareEngineer.class);
		emp3.assist();
		
		
		
	}

}
