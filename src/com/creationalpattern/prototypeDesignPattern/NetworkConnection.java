package com.creationalpattern.prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
	
	private String ip;
	private String importantData;
	private List<String> domains = new ArrayList<>();
	
	
	
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	public void loadVeryImportantData() throws InterruptedException {
		this.importantData= "This data is most important";
		
		domains.add("www.LeranCode.com");
		domains.add("www.google");
		domains.add("www.Youtube");
		Thread.sleep(5000);
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		NetworkConnection connection = new NetworkConnection();
		connection.setIp(this.getIp());
		connection.setImportantData(this.getImportantData());
		
		for(String str: this.getDomains()) {
			connection.getDomains().add(str);
		}
		return connection;
	}
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
	}

	
}
