package com.atom.singleton;

/**
 *ö��ʽ
 *����һ��ö�ٵ�Ԫ�أ����ʹ�����Singleton��һ��ʵ����
 *ȱ��:���ӳټ���
 *�ŵ�:ö�ٱ�����ǵ���ģʽ����JVM�Ӹ������ṩ���ϣ�����ͨ������ͷ����л���©����
 */
public enum SingletonEnum {
	INSTANCE;
	/**
	* �����������Լ��Ĳ���
	*/
	public void singletonOperation(){
	//���ܴ���
	}
}

/*public class Test{
	public static void main(String[] args) {
		SingletonEnum s1=SingletonEnum.INSTANCE;
		SingletonEnum s2=SingletonEnum.INSTANCE;
		System.out.println(s1==s2);
	}
}*/
	
