package com.atom.singleton;

import java.io.Serializable;

/**
 *懒汉式
 **延时加载，懒加载，真正用时才加载，调用效率不高
* 资源利用率高
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
