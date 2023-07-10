package com.creationalpattern.singletonpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPattenMainBreakingWithReflectionApi {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Samosa samosa= Samosa.getInstance();
		System.out.println("Samosa 1 "+samosa.hashCode());
		
		Samosa samosa2= Samosa.getInstance();
		System.out.println("Samosa 2 "+samosa2.hashCode());
		
		//Braking singleton pattern 
		//1. Reflection Api
		
		try {
			Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			Samosa samos3= constructor.newInstance();
			System.out.println("Samosa 3 "+ samos3.hashCode());
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
