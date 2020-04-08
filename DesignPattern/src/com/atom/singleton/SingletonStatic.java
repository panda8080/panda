package com.atom.singleton;

/**
 *��̬�ڲ���ʽ
 *�ⲿ��û��static����,���������ʽ�����������ض���
 *ֻ����������ʱ�Ż����������ڲ���,������ʱ����Ȼ���̰߳�ȫ
 *��߸�Ч���ú��ӳټ�������
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
