package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.stereotype.Component;
@Component
public class TestBean {
	
	public void testProxy(){
		System.out.println("I am a proxy test method");
		TestProxyInterface test = new SubClassHidingMainClass();
		String name = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		test.checkName(name);
	}

}
