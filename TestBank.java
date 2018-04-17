package com.abstractionConcept.java;

public class TestBank {

	public static void main(String[] args) {
		
		HDFC hb=new HDFC();
		
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		System.out.println("==================");
		Bank b = new HDFC(); //dynamic polymorphism
		b.credit();
		b.debit();
		b.loan();
	

	}

}
