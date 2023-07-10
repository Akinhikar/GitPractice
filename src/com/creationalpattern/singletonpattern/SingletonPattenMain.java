package com.creationalpattern.singletonpattern;

import java.lang.reflect.InvocationTargetException;

public class SingletonPattenMain {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Samosa samosa= Samosa.getInstance();
		System.out.println("Samosa 1 "+samosa.hashCode());
		
		Samosa samosa2= Samosa.getInstance();
		System.out.println("Samosa 2 "+samosa2.hashCode());
		
	}
}
