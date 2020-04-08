package com.atom.staticProxy;

interface NetWork {
	public void browse();
}

class Real implements NetWork{

	@Override
	public void browse() {
		System.out.println("���������Ϣ");
	}
};

class Proxy implements NetWork{
	private NetWork netWork;		//���������ʵ����
	
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
		System.out.println("����û��Ƿ�Ϸ�");
	}
};