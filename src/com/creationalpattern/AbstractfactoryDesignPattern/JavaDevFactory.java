package com.creationalpattern.AbstractfactoryDesignPattern;

public class JavaDevFactory extends AbstactEmployeeFactory {

	@Override
	public Employee createEmployee() {
		return new JavaDeveloper();
	}

}
