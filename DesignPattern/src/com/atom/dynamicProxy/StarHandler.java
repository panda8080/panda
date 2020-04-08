package com.atom.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{
	private Star realStar;		//��ʵ���������
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	} 

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		method.invoke(realStar, args);	//������õķ���
//		return null;
		Object object = null;
		System.out.println("�����ķ���ִ��ǰ");
		if(method.getName().equals("sing")) {
		 object = method.invoke(realStar, args);
		}else {
			System.out.println("donothing");
		}
		System.out.println("�����ķ���ִ�к�");
		System.out.println("��Ǯ");
		return object;
	}

}
