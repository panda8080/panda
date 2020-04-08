package com.atom.dynamicProxy;

interface Subject {
	public String say(String name, int age);
}

class RealSubject implements Subject{

	@Override
	public String say(String name, int age) {
			return "ĞÕÃû: "+name+", ÄêÁä: "+age;
	}
}