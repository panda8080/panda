package com.atom.singleton;

/**
 * 双重检测
 *
 */
public class SingletonDouble {
	private static SingletonDouble instance=null;
	private SingletonDouble() {}
	/*这个模式将同步内容下方到if内部，提高了执行的效率
	不必每次获取对象时都进行同步，只有第一次才同步
	创建了以后就没必要了。*/
	public static SingletonDouble getInstance() {
		if(instance==null) {
			SingletonDouble sc;
			/*
			 * 同步代码块:synchronized(obj){}
			 *非静态方法中:obj一般指代this,即当前对象
			 *静态方法中:当前类本身，如: SingletonDouble.class
			 * */
			synchronized(SingletonDouble.class) {
				sc=instance;
				if(sc==null) {
					synchronized(SingletonDouble.class) {
						if(sc==null) {
							sc=new SingletonDouble();
						}
					}
					instance=sc;
				}
			}
		}
		return instance;
	}
}
