package com.marcin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		

		//load spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		
		Coach firstCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach secondCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = firstCoach == secondCoach;
		
		System.out.println("Pointing to the same object: " + result);
		
		System.out.println("\nMemory location for firstCoach: " + firstCoach);
		
		System.out.println("\nMemory location for secondCoach: " + secondCoach);

		
		context.close();
				
	}

}
