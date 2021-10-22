package com.marcin.springdemo;

public class OkayFortuneService implements FortuneService {

	@Override
	public String getFortune() {
	
		return "Today is just an OK day.";
	}

}
