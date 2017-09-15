package kr.ac.dit.domain;

public class studentVO {
	// VO = Value Object (값 저장소)[캡슐화]
	private String number;
	private String name;
 
	//getter and setter
	public String getNumber() {
		return number;
	}
	 
	public void setNumber(String number) {
		this.number = number;
	}
	 
	public String getName() {
		return name;
	}
	 
	public void setName(String name) {
		this.name = name;
	}
	 
}