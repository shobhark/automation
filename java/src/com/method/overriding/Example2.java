package com.method.overriding;

public class Example2 extends Example1 {
	
	
	public void test()
	{
		System.out.println("test() from child method");
	}

	public void test1()
	{
		System.out.println("test1() from child method");
	}
	public void test2()
	{
		System.out.println("test2() from child method");
	}

	
	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.test();
		obj.test1();
		obj.test2();
		System.out.println();	
	
		Example1 obj1 = new Example2();
		obj1.test();
		obj1.test1();
		//obj1.test2();
		
	
	
	}

}
