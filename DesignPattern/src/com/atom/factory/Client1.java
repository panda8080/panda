package com.atom.factory;

import java.util.Properties;

public class Client1 {

	public static void main(String[] args) throws Exception {
		Fruit f = null;
//		f=Factory.getInstance("apple");
		
		//通过工厂类取得接口实例，传入完整的包.类名称
		//f=Factory2.getInstance("com.atom.factory.Apple");
		
		//通过属性的key传入完整的包.类名称
		Properties pro = Init.getPro();
		 f = (Fruit)Factory2.getInstance(pro.getProperty("apple"));
		
		if(f!=null) {
			f.eat();
		}
	}

}
