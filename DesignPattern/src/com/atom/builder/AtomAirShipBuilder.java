package com.atom.builder;

public class AtomAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine buildEngine() {		//也可以通过工厂类获取发动机对象，和工厂模式结合使用
		System.out.println("构建atom牌发动机");
		return new Engine("atom发动机");
	}

	@Override
	public OrbitalModule buildOrbitralModule() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("atom牌轨道舱");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("构建逃逸塔");
		return new EscapeTower("atom牌逃逸塔");
	}	
	//StringBuilder,以后学习XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
	
}
