package com.atom.builder;

public class AtomAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine buildEngine() {		//Ҳ����ͨ���������ȡ���������󣬺͹���ģʽ���ʹ��
		System.out.println("����atom�Ʒ�����");
		return new Engine("atom������");
	}

	@Override
	public OrbitalModule buildOrbitralModule() {
		System.out.println("���������");
		return new OrbitalModule("atom�ƹ����");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("����������");
		return new EscapeTower("atom��������");
	}	
	//StringBuilder,�Ժ�ѧϰXML�����У�JDOM���е��ࣺDomBuilder,SaxBuilder
	
}
