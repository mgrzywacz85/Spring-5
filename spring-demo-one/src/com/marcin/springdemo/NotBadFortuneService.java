package com.marcin.springdemo;

public class NotBadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is not bad, actually";
	}

}
