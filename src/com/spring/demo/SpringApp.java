package com.spring.demo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args)
	{
		//spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach =context.getBean("myCoach",Coach.class);
		
		
		
		System.out.println(theCoach.getDailyWorkout());
		context.close();
		

	}

}
