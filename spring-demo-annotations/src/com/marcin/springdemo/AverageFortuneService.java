package com.marcin.springdemo;

import org.springframework.stereotype.Component;

@Component
public class AverageFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is an average day";
				
	}

}
