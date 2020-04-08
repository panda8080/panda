package com.atom.builder;

public class AtomAirShipDirector  implements AirShipDirector{

	private AirShipBuilder builder;
	
	public AtomAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}


	@Override
	public AirShip directAirShip() {
		Engine e=builder.buildEngine();
		OrbitalModule o = builder.buildOrbitralModule();
		EscapeTower es=builder.buildEscapeTower();
		
		//装配成飞船对象
		AirShip airShip=new AirShip();
		airShip.setEngine(e);
		airShip.setEscapeTower(es);
		airShip.setOrbitalModule(o);
		return airShip;
	}
	
}
