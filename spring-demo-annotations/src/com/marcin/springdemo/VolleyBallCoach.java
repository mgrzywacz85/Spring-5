package com.marcin.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VolleyBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Play some volleyball";
	}

}
