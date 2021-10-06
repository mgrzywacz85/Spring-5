package com.marcin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		
		//get the bean from the spring container
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach volleyCoach = context.getBean("volleyBallCoach", Coach.class);
				
		
		//call methods on the bean
		
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(volleyCoach.getDailyWorkout());
		
		//close the container
		
		context.close();
		
		
	}

}
