package com.atom.dynamicProxy;

interface Star {
	public void bookOrder();
	public void sing();
	public void collectMoney();
}

class RealStar implements Star{

	@Override
	public void bookOrder() {
		System.out.println("承接活动");
	}

	@Override
	public void sing() {
		System.out.println("周杰伦唱歌!");
	}

	@Override
	public void collectMoney() {
		System.out.println("收钱");
	}
	
}