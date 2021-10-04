package com.marcin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load Spring configuration file
			
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from Spring container
				
		Coach theCoach = context.getBean("myCoach", Coach.class);
				
		
		//call methods on bean
		
		System.out.println(theCoach.getDailyWorkout());
			
		
		//close the application context
		
		context.close();

	}

}
