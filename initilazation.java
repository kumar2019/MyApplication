package com.core;

public class Initilization 
{
	private static String methodOne(String msg)
	{
		System.out.println(msg);
		return msg;
	}
	static String m=methodOne("1");
	{
		m=methodOne("2");
	}
	static
	{
		m=methodOne("3");
	}

	public static void main(String[] args)
	{
     
		Object obj=new Initilization();
		Systom.out.println("This new  change");
	}

}
