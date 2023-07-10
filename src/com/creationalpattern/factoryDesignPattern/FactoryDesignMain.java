package com.creationalpattern.factoryDesignPattern;

public class FactoryDesignMain {
	
	public static void main(String[] args) {
		//Employee employee= new AndroidDeveloper();
		
		Employee employee = EmployeeFactory.getEmployee("Java Developer");
		System.out.println("Salary "+employee.getSalary());
	}

}
