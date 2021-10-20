package com.marcin.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	//define init method - can be any name, does not take args and usually void as result cannot be captured
	
	@PostConstruct
	public void postInitMethod() {
		System.out.println("Starting...");
	}	
	
	//define destroy method - can be any name, does not take args and usually void as result cannot be captured
	
	@PreDestroy
	public void preDestroyMethod() {
		System.out.println("Finishing...");
	}
	
	@Autowired
	@Qualifier("averageFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice tennis for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
