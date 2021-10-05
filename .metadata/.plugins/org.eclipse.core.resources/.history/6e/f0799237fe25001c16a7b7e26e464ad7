package com.marcin.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService; 
	
	//create no-argument constructor
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//create setter for Spring to use
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside the setter method");
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyWorkout() {
		
		return "Practice some cricket stuff for 15 mins";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
