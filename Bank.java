package com.abstractionConcept.java;

public abstract class Bank {
	
	/* 1. aka partial abstraction
	 * 2. Hiding the implementation logic -->callled as Abstraction 
	 * 3.Abstract method can have abstract method and non-abstract method 
	 * 4.Can not create object of Abstract class
	 */
	
	abstract void loan();// Abstract method has no body
	
	//Below are NON-ABSTRACT method
	public void credit()
	{
		System.out.println("Credit methos of Bank");
	}
	
	public void debit()
	{
		System.out.println("Debit method of Bank");
	}

}
