package com.lti.demo;

public class Person {
	private String pName;
	private int pAge;
	private double pScore;
	
	public Person() {
		super();
	}
	public Person(String pName, int pAge, double pScore) {
		super();
		this.pName = pName;
		this.pAge = pAge;
		this.pScore = pScore;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public double getpScore() {
		return pScore;
	}
	public void setpScore(double pScore) {
		this.pScore = pScore;
	}
	
	@Override
	public String toString() {
		return "Person [pName=" + pName + ", pAge=" + pAge + ", pScore=" + pScore + "]\n";
	}
}
