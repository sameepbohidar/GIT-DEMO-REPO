package com.sameep.git;

public class App {
	
	public void addData(String data)
	{
		System.out.println("data is:"+data);
		
		
		if(data.equals("java"))
		{
			System.out.println("welcome java");
		}
		else
		{
			System.out.println("hello world");
		}
		
		
		System.out.println("this line is added manually in remote repo for checking");
		
	}
	
	public static void main(String[] args) {
		System.out.println("hello git");
	}

}
