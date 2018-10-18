package com.spring.demo;

public class BaseballCoach implements Coach
{
	
	// this is the private field for dependency
	private FortuneService fortuneService;
	
	//constructor for dependency injections
	
	public BaseballCoach(FortuneService theFortuneService) 
	{
		fortuneService=theFortuneService;
	}
	
	public String getDailyWorkout() 
	{
		return "spend sometime in workingout using tralier";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
