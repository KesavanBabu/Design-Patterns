package com.example;

public class SubClassHidingMainClass implements TestProxyInterface{

	
	String name;
	
	public MainClass mainClass = new MainClass();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void checkName(String name) {
		// This class protects the mainclass and provides a proxy interface for the same.
		// the check is happening in the proxy class and control gets transferred to the 
		// main class only when the condition is satisfied 
		String reverse = "";
		Boolean notAllow = false;
		for(int i= name.length() -1;i>=0;i--){
			reverse = reverse + name.charAt(i);
		}
		if(name.equalsIgnoreCase(reverse)){
			notAllow =true;
		}
		if(notAllow == false){
			mainClass.checkName(name);
		}else{
			System.out.println("Not an expected name");
		}
		
	}

}
