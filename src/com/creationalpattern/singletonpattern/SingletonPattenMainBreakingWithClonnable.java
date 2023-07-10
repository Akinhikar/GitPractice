package com.creationalpattern.singletonpattern;

public class SingletonPattenMainBreakingWithClonnable {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Samosa samosa= Samosa.getInstance();
		System.out.println(samosa.hashCode());
		
		Samosa samosa2= (Samosa) samosa.clone();
		System.out.println(samosa2.hashCode());
	}

}
