package com.mn.test;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Employee employee=new Employee();
		employee.setCallback(new Boss());
		employee.doSome();
	}

}
