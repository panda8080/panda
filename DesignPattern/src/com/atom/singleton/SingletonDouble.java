package com.atom.singleton;

/**
 * ˫�ؼ��
 *
 */
public class SingletonDouble {
	private static SingletonDouble instance=null;
	private SingletonDouble() {}
	/*���ģʽ��ͬ�������·���if�ڲ��������ִ�е�Ч��
	����ÿ�λ�ȡ����ʱ������ͬ����ֻ�е�һ�β�ͬ��
	�������Ժ��û��Ҫ�ˡ�*/
	public static SingletonDouble getInstance() {
		if(instance==null) {
			SingletonDouble sc;
			/*
			 * ͬ�������:synchronized(obj){}
			 *�Ǿ�̬������:objһ��ָ��this,����ǰ����
			 *��̬������:��ǰ�౾����: SingletonDouble.class
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
