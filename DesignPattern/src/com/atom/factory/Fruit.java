package com.atom.factory;

import java.io.File;
import java.util.Properties;
import java.io.*;

public interface Fruit {
	public void eat();
};
class Apple implements Fruit{

	@Override
	public void eat() {
		System.out.println("吃苹果!");
	}
};

class Orange implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃橘子!");
	}	
};

class Factory{
	public static Fruit getInstance(String name) {
		Fruit f=null;
		if("apple".equals(name)) {
			f=new Apple();
		}
		if("orange".equals(name)) {
			f=new Orange();
		}
		return f;
	}
};

/**
 * 将反射应用在工厂模式中
 *
 */
class Factory2{
	public static Fruit getInstance(String className) throws Exception{
		Fruit f=null;
		f=(Fruit)Class.forName(className ).newInstance();
		return f;
	}
};

/*
 * 属性操作类
 * 通过属性文件配置所要的子类信息
 * */
class Init{
	public static Properties getPro() {
		Properties pro=new Properties();
		File f=new File("fruit.properties");
		try {
			if(f.exists()) {
				pro.load(new FileInputStream(f));
			}else {
				pro.setProperty("apple", "com.atom.factory.Apple");
				pro.setProperty("orange", "com.atom.factory.Orange");
				pro.store(new FileOutputStream(f),"FRUIT CLASS");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pro;
	}	
};

