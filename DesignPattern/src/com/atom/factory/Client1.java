package com.atom.factory;

import java.util.Properties;

public class Client1 {

	public static void main(String[] args) throws Exception {
		Fruit f = null;
//		f=Factory.getInstance("apple");
		
		//ͨ��������ȡ�ýӿ�ʵ�������������İ�.������
		//f=Factory2.getInstance("com.atom.factory.Apple");
		
		//ͨ�����Ե�key���������İ�.������
		Properties pro = Init.getPro();
		 f = (Fruit)Factory2.getInstance(pro.getProperty("apple"));
		
		if(f!=null) {
			f.eat();
		}
	}

}
