package com.abstractionConcept.java;

public class TestInterface {

	public static void main(String[] args) {
		
		BMW bm = new  BMW();
		bm.fuel();
		bm.run();
		bm.speed();
		bm.refuel();
		
		System.out.println("===============");
		
		InterFaceConcept ic=new BMW();
		ic.fuel();
		ic.speed();
		ic.run();

	}

}
