package com.atom.singleton;

/**
 *枚举式
 *定义一个枚举的元素，它就代表了Singleton的一个实例。
 *缺点:无延迟加载
 *优点:枚举本身就是单例模式。由JVM从根本上提供保障！避免通过反射和反序列化的漏洞！
 */
public enum SingletonEnum {
	INSTANCE;
	/**
	* 单例可以有自己的操作
	*/
	public void singletonOperation(){
	//功能处理
	}
}

/*public class Test{
	public static void main(String[] args) {
		SingletonEnum s1=SingletonEnum.INSTANCE;
		SingletonEnum s2=SingletonEnum.INSTANCE;
		System.out.println(s1==s2);
	}
}*/
	
