package com.atom.singleton;

/**
 *静态内部类式
 *外部类没有static属性,不会像饿汉式那样立即加载对象
 *只有真正调用时才会真正加载内部类,加载类时是天然的线程安全
 *兼具高效调用和延迟加载优势
 */
public class SingletonStatic {
	private static class SingletonClassInstance{
		private static final SingletonStatic INSTANCE=new SingletonStatic();
	}
	private SingletonStatic() {}
	public static SingletonStatic getInstance() {
		return SingletonClassInstance.INSTANCE;
	}
}
