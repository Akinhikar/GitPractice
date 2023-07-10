package com.creationalpattern.AbstractfactoryDesignPattern;

public class JavaDeveloper implements Employee {

	@Override
	public int getSalary() {
		return 8907650;
	}

	@Override
	public String getName() {
		System.out.println("I am java Developer");
		return "Java Developer";
	}

}
