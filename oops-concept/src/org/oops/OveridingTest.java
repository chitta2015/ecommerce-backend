package org.oops;

class Parent
{
	public void demo()
	{
		System.out.println("Parent class method");
	}
	
}


class Child extends Parent
{
	public void demo()
	{
		System.out.println("child class method");
	}
}


public class OveridingTest {

	public static void main(String[] args) {
	
		Parent p=new Child();//Upcasting
		p.demo();
	
		Child c=(Child) p;//Downcasting
		c.demo();

		Parent p1=new Parent();
		p1.demo();
		
		//int a=(int)12.56;

	}

}
