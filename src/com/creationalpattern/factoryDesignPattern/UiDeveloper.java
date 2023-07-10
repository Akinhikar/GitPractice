package com.creationalpattern.factoryDesignPattern;

public class UiDeveloper implements Employee{

	@Override
	public int getSalary() {
		System.out.println("Getting salary of Ui developer");
		return 300000;
	}

}
