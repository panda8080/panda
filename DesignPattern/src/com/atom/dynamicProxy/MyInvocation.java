package com.atom.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocation implements InvocationHandler{
	private Object obj;		//真实主体

	public Object bind(Object obj) {
		this.obj=obj;		//绑定真实操作主体
		//取得代理对象
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {	//动态调用方法
		Object temp=method.invoke(obj, args);		//调用方法，传入真实主体和参数
		return temp;	//返回方法的返回信息
	}

}
