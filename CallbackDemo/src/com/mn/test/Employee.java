package com.mn.test;


public class Employee {
	private CallbackInterface callback;

	public void setCallback(CallbackInterface callback) {
		this.callback = callback;
	}
	public void doSome(){
		System.out.println("事情干完啦");
		callback.execute();
	}
	
}
