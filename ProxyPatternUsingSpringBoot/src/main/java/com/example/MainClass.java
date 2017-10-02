package com.example;

public class MainClass implements TestProxyInterface {

	@Override
	public void checkName(String name) {
		// TODO Auto-generated method stub
		
		if (name != null){
			System.out.println("Your name is fine. you are accepted");
		}
		
	}

}
