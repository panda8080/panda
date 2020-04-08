package com.atom.builder;

public class Client {
	public static void main(String[] args) {
		AirShipDirector ad=new AtomAirShipDirector(new AtomAirShipBuilder());
		AirShip as =ad.directAirShip();
		System.out.println(as);
		as.launch();
	}
}
