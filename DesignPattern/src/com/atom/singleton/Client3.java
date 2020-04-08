package com.atom.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试五种创建单例模式的效率
 *
 */
final class Client3 {

	public static void main(String[] args) throws InterruptedException {
		int threadNum=10;
		//方法中声明的内部类不能直接访问方法中的参数，因为内部类和外部局部变量的生命周期不一样
		//参数前加上final关键字后可以
		CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		long start = System.currentTimeMillis();
		
		for(int i=0;i<threadNum;i++) {			//开启十个线程
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int j=0;j<100000;j++) {
//						Object o = SingletonHungry.getInstance();
						Object o = SingletonLazy.getInstance();
//						Object o = SingletonStatic.getInstance();
//						Object o = SingletonDouble.getInstance();
//						Object o = SingletonEnum.INSTANCE;
					}
					countDownLatch.countDown();
				}				
			}).start();
		}
		//await这个阻塞内部就是个循环，检测计数器是否为0
		countDownLatch.await();	//main线程阻塞，直到计数器为0才会继续执行
		long end = System.currentTimeMillis();
		System.out.println("总耗时: "+(end-start));
	}
}
