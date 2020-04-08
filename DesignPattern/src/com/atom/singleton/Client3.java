package com.atom.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * �������ִ�������ģʽ��Ч��
 *
 */
final class Client3 {

	public static void main(String[] args) throws InterruptedException {
		int threadNum=10;
		//�������������ڲ��಻��ֱ�ӷ��ʷ����еĲ�������Ϊ�ڲ�����ⲿ�ֲ��������������ڲ�һ��
		//����ǰ����final�ؼ��ֺ����
		CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		long start = System.currentTimeMillis();
		
		for(int i=0;i<threadNum;i++) {			//����ʮ���߳�
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
		//await��������ڲ����Ǹ�ѭ�������������Ƿ�Ϊ0
		countDownLatch.await();	//main�߳�������ֱ��������Ϊ0�Ż����ִ��
		long end = System.currentTimeMillis();
		System.out.println("�ܺ�ʱ: "+(end-start));
	}
}
