package com.atom.dynamicProxy;

public class DynamicProxyDemo1 {
	public static void main(String[] args) {
		MyInvocation handler = new MyInvocation();		//ʵ�������������
		Subject sub =(Subject) handler.bind(new RealSubject());
		String info=sub.say("ltt", 3);
	}
}
