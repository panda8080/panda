package com.atom.builder;

public class AirShip {
	private Engine engine;
	private EscapeTower escapeTower;
	private OrbitalModule OrbitalModule;
	public void launch() {
		System.out.println("·¢Éä");
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	public OrbitalModule getOrbitalModule() {
		return OrbitalModule;
	}
	public void setOrbitalModule(OrbitalModule OrbitalModule) {
		this.OrbitalModule = OrbitalModule;
	}
	
}

class Engine{
	private String name;

	public Engine(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class EscapeTower{
	private String name;
	public EscapeTower(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class OrbitalModule{
	private String name;
	public OrbitalModule(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
