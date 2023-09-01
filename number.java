//write a java code to input 2 int num in super class and perform swap and power of this 2 numbers using sub classes

import java.util.Scanner;
import java.lang.Math;
class a
{
	double a,b,c;
	void take()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("the 1st value is A = ");
		a = s.nextDouble();
		System.out.println("the 2nd value is B = ");
		b = s.nextDouble();
	}
}
class b extends a
{
	void swap()
	{
		c =a;
		a=b;
		b = c;
		System.out.println("after swap the 1st value is A = "+a);
		System.out.println("after swap the 2nd value is B = "+b);
	}
}
class c extends a
{	double p,q;
	void power()
	{
	p = Math.pow(a,b);	
	q = Math.pow(b,a);
	System.out.println("the 1st power value of A = "+p);
	System.out.println("the 2nd power value of B = "+q);
	}
}
class number
{
	public static void main(String args[])
	{
		b ob = new b();
		ob.take();
		ob.swap();
		c obc = new c();
		obc.take();
		obc.power();
	}
}
		