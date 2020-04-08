package com.atom.dynamicProxy;

interface Star {
	public void bookOrder();
	public void sing();
	public void collectMoney();
}

class RealStar implements Star{

	@Override
	public void bookOrder() {
		System.out.println("�нӻ");
	}

	@Override
	public void sing() {
		System.out.println("�ܽ��׳���!");
	}

	@Override
	public void collectMoney() {
		System.out.println("��Ǯ");
	}
	
}