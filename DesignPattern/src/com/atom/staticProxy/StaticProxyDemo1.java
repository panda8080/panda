package com.atom.staticProxy;

public class StaticProxyDemo1 {

	public static void main(String[] args) {
		NetWork network = null;			//定义接口对象
		network=new Proxy(new Real());		//实例化代理，同时传入真实主体
		network.browse();		//客户只关心上网浏览这个功能
	}

}
