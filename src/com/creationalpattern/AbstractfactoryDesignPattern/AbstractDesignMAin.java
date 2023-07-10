package com.creationalpattern.AbstractfactoryDesignPattern;

public class AbstractDesignMAin {
	public static void main(String[] args) {
		Employee e = EmployeeFacrory.getEmployee(new AndroidDevFactory());
		System.out.println(e.getName());
		
		Employee e2 = EmployeeFacrory.getEmployee(new JavaDevFactory());
		System.out.println(e2.getName());
	}

}
