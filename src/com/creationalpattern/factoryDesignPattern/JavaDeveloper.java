package com.creationalpattern.factoryDesignPattern;

public class JavaDeveloper implements Employee{

	@Override
	public int getSalary() {
		System.out.println("Getting salary of Java developer");
		return 900000;
	}

}
