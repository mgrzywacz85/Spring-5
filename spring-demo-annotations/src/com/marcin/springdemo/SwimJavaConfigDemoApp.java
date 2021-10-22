package com.marcin.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
				
		
		//get bean from spring container
		
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		
		//call methods on the bean		
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call method on the dependency - HappyFortuneService
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the container
		
		context.close();
		
		
	}

}
