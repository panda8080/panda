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
		System.out.println("��ƻ��!");
	}
};

class Orange implements Fruit{
	@Override
	public void eat() {
		System.out.println("������!");
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
 * ������Ӧ���ڹ���ģʽ��
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
 * ���Բ�����
 * ͨ�������ļ�������Ҫ��������Ϣ
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

