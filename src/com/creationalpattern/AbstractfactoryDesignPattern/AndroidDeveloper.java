package com.creationalpattern.AbstractfactoryDesignPattern;

public class AndroidDeveloper implements Employee{

	@Override
	public int getSalary() {
		System.out.println("Android developer");
		return 50000;
	}

	@Override
	public String getName() {
		return "I am Android developer";
	}

}
