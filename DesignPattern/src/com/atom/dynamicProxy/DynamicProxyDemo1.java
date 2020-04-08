package com.atom.dynamicProxy;

public class DynamicProxyDemo1 {
	public static void main(String[] args) {
		MyInvocation handler = new MyInvocation();		//实例化代理操作类
		Subject sub =(Subject) handler.bind(new RealSubject());
		String info=sub.say("ltt", 3);
	}
}
