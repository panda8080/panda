package com.atom.staticProxy;

public class StaticProxyDemo1 {

	public static void main(String[] args) {
		NetWork network = null;			//����ӿڶ���
		network=new Proxy(new Real());		//ʵ��������ͬʱ������ʵ����
		network.browse();		//�ͻ�ֻ������������������
	}

}
