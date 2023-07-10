package com.creationalpattern.AbstractfactoryDesignPattern;

public class AndroidDevFactory extends AbstactEmployeeFactory{

	@Override
	public Employee createEmployee() {
		return new AndroidDeveloper();
	}

}
