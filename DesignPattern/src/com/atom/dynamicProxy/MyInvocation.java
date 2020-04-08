package com.atom.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocation implements InvocationHandler{
	private Object obj;		//��ʵ����

	public Object bind(Object obj) {
		this.obj=obj;		//����ʵ��������
		//ȡ�ô������
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {	//��̬���÷���
		Object temp=method.invoke(obj, args);		//���÷�����������ʵ����Ͳ���
		return temp;	//���ط����ķ�����Ϣ
	}

}
