package com.atom.dynamicProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo2 {

	public static void main(String[] args) {
		Star realStar = new RealStar();
		 StarHandler handler = new StarHandler(realStar);
		 Star proxy=(Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
		 proxy.bookOrder();
		 proxy.sing();
	}

}
