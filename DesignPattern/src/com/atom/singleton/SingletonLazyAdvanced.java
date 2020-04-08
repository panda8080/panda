package com.atom.singleton;

import java.io.Serializable;

/**
 * 测试懒汉式:如何防止反射和反序列化漏洞
 * • 问题：
* – 反射可以破解上面几种(不包含枚举式)实现方式！（可以在构造方法中手动
* 抛出异常控制）
* – 反序列化可以破解上面几种((不包含枚举式))实现方式！
* • 可以通过定义readResolve()防止获得不同对象。
* – 反序列化时，如果对象所在类定义了readResolve()，（实际是一种回调），
* 定义返回哪个对象。
 *
 */
public class SingletonLazyAdvanced implements Serializable{
	private static SingletonLazyAdvanced instance;
	private SingletonLazyAdvanced() throws Exception {
		if(instance!=null) {
			//通过手动抛出异常，避免通过反射创建多个对象
			throw new RuntimeException("只能创建一个对象");
		}
	}
	public static SingletonLazyAdvanced getInstance() throws Exception {
		if(instance==null) {
			instance=new SingletonLazyAdvanced();
		}
		return instance;
	}
	
	//反序列化时，如果对象所在类定义了readResolve(),则直接返回方法指定的对象,而不需要单独再创建新对象
	private Object readResolve() {
		return instance;
	}
}
