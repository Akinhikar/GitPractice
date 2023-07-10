package com.creationalpattern.factoryDesignPattern;

public class EmployeeFactory {

	public static Employee getEmployee(String empType) {
		if (empType.trim().equalsIgnoreCase("Android Developer")) {
			return new AndroidDeveloper();
		} else if (empType.trim().equalsIgnoreCase("Java Developer")) {
			return new JavaDeveloper();
		} else if (empType.trim().equalsIgnoreCase("Ui Developer")) {
			return new UiDeveloper();
		} else {
			return null;
		}
	}
}
