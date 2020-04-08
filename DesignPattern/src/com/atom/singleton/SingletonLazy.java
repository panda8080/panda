package com.atom.singleton;

import java.io.Serializable;

/**
 *����ʽ
 **��ʱ���أ������أ�������ʱ�ż��أ�����Ч�ʲ���
* ��Դ�����ʸ�
 */
public class SingletonLazy implements Serializable{
	private static SingletonLazy instance;
	private SingletonLazy() {}
	public synchronized static SingletonLazy getInstance() {
		if(instance==null) {
			instance=new SingletonLazy();
		}
		return instance;
	}
}
