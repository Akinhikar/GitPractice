package com.creationalpattern.AbstractfactoryDesignPattern;

public class EmployeeFacrory {

	public static Employee getEmployee(AbstactEmployeeFactory abempFactory) {
		return abempFactory.createEmployee();
	}
}
