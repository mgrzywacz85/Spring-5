package com.marcin.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.marcin.springdemo")
public class SportConfig {
	
	//define bean for okayFortuneService
	
	@Bean
	public FortuneService okayFortuneService() {
		return new OkayFortuneService();
	}
		
	
	//define bean for SwimCoach and inject dependency

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(okayFortuneService());
	}
	
	
}
