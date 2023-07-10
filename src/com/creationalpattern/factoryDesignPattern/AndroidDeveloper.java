package com.creationalpattern.factoryDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Getting salary of Android developer");
		return 500000;
	}

}
