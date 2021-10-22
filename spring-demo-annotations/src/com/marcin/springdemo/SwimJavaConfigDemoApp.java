package com.marcin.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
				
		
		//get bean from spring container
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		
		//call methods on the bean		
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call method on the dependency - HappyFortuneService
		
		System.out.println(theCoach.getDailyFortune());
		
		//call SwimCoach methods
		
		System.out.println("e-mail: " + theCoach.getEmail());		
		
		
		System.out.println("team: " + theCoach.getTeam());	
		
		//close the container
		
		context.close();
		
		
	}

}
