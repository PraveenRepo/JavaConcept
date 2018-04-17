package com.abstractionConcept.java;

public class BMW implements InterFaceConcept {

	@Override
	public void run() {
		System.out.println("runnig fast");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed limit");
		
	}

	@Override
	public void fuel() {
		System.out.println("fuel consumption");
		
	}
	
	public void refuel()
	{
		System.out.println("Re-fuel consumption");
	}

	

	

}
