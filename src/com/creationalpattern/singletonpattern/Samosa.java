package com.creationalpattern.singletonpattern;

import java.io.Serializable;

//Lazy loading : When required that time only the object created 
public class Samosa implements Serializable, Cloneable {

	public static Samosa samosa;

//Solution for reflection api
	private Samosa() {
		if (samosa != null) {
			throw new RuntimeException("You are trying to break the singleton pattrn");
		}

	}

	public static Samosa getInstance() {
		if (samosa == null) {
			synchronized (Samosa.class) {
				if (samosa == null) {
					samosa = new Samosa();
				}
			}
		}
		return samosa;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return samosa;
	}
}
