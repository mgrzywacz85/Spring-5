package com.marcin.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")  //field level injection
	private String email;
	
	@Value("${foo.team}")    //field level injection
	private String team;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Swim 100 meters";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
