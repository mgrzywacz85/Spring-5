package com.marcin.springdemo;

public class AlrightFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is kind of alright";
	}

}
