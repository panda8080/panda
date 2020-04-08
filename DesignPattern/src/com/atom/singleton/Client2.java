package com.atom.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *���Է���ͷ����л��ƽ�
 *
 */
public class Client2 {
	public static void main(String[] args) throws Exception {
//		SingletonLazy s1=SingletonLazy.getInstance();
//		SingletonLazy s2=SingletonLazy.getInstance();
//		System.out.println(s1);
//		System.out.println(s2);
		
		SingletonLazyAdvanced sa1=SingletonLazyAdvanced.getInstance();
		SingletonLazyAdvanced sa2=SingletonLazyAdvanced.getInstance();
		System.out.println(sa1);
		
		/*//ͨ������ķ�ʽֱ�ӵ���˽�й����� 
		Class<SingletonLazy> c=(Class<SingletonLazy>)Class.forName("com.atom.singleton.SingletonLazy");
		//��ȡ������
		Constructor<SingletonLazy> cons= c.getDeclaredConstructor(null);
	    cons.setAccessible(true);
		SingletonLazy s3=cons.newInstance(null);
		SingletonLazy s4=cons.newInstance(null);
		System.out.println(s3);
		System.out.println(s4);
		
		Class<SingletonLazyAdvanced> c2=(Class<SingletonLazyAdvanced>)Class.forName("com.atom.singleton.SingletonLazyAdvanced");
		Constructor<SingletonLazyAdvanced> cons2=c2.getConstructor(null);
		SingletonLazyAdvanced sa3 = cons2.newInstance(null);		
		System.out.println(sa3);
		*/
		
		//ͨ�������л�����������
		FileOutputStream fos   =  new FileOutputStream("d:"+File.separator+"a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//oos.writeObject(s1);
		oos.writeObject(sa1);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("d:"+File.separator+"a.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//SingletonLazy  newS = (SingletonLazy)ois.readObject();
		SingletonLazyAdvanced  newS = (SingletonLazyAdvanced)ois.readObject();
		System.out.println(newS);
	}
}
