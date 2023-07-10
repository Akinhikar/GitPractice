package com.creationalpattern.prototypeDesignPattern;

public class PrototypeMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Creating object using prototype pattern");

		NetworkConnection connection = new NetworkConnection();
		connection.setIp("109.98.98.8");
		connection.loadVeryImportantData();

		System.out.println(connection);
		try {
			NetworkConnection connection2 = (NetworkConnection) connection.clone();
			NetworkConnection connection3 = (NetworkConnection) connection.clone();
			
			connection.getDomains().remove(0);
			System.out.println(connection);
			System.out.println(connection2);
			System.out.println(connection3);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
