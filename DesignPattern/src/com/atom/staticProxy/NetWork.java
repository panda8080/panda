package com.atom.staticProxy;

interface NetWork {
	public void browse();
}

class Real implements NetWork{

	@Override
	public void browse() {
		System.out.println("上网浏览信息");
	}
};

class Proxy implements NetWork{
	private NetWork netWork;		//被代理的真实对象
	
	public Proxy(NetWork netWork) {
		super();
		this.netWork = netWork;
	}

	@Override
	public void browse() {
		this.check();
		this.netWork.browse();
	}
	
	public void check() {
		System.out.println("检查用户是否合法");
	}
};