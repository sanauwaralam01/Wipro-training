//package Techadmy;
 
interface calculator{
	static void add (int a, int b)
	{
		System.out.println(a+b);
	}
}
public class Static_ex {
 
	public static void main(String[] args)
	{
calculator.add(10, 20);
	}
 
}
