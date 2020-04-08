package com.atom.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{
	private Star realStar;		//真实被代理对象
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	} 

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		method.invoke(realStar, args);	//激活调用的方法
//		return null;
		Object object = null;
		System.out.println("真正的方法执行前");
		if(method.getName().equals("sing")) {
		 object = method.invoke(realStar, args);
		}else {
			System.out.println("donothing");
		}
		System.out.println("真正的方法执行后");
		System.out.println("收钱");
		return object;
	}

}
