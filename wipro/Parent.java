//package Techadmy;
 
public class Parent
{
	Parent()
	{
		System.out.println("Parent Class Constructor");
	}
}
class child extends Parent
{
	child()
	{
	super();
	System.out.println("Child class constructor");
	}
public static void main(String[] args)
{
  child obj = new child();
}
}
 
