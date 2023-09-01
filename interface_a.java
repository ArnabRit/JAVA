import java.util.Scanner;
interface area 
{
	final static float pi = 3.144F;
	void compute (float x, float y);
}
class Rectangle implements area 
{
	public void compute (float x, float y)
	{
		System.out.println("the area of rectangle = " + x*y);
	}
}
class Circle implements area 
{
	public void compute ( float x , float y)
	{
		System.out.println ("the area of circle = " + pi*x*x);
	}
}
class interface_a
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 2 sides of rectangle = ");
		float p = s.nextFloat();
		float q = s.nextFloat();
		System.out.println(" enter the redious of circle = ");
		float r = s.nextFloat();
		float z = s.nextFloat();
		Rectangle a = new Rectangle();	
		Circle b = new Circle();
		area y ;
		y = a;
		y.compute(p,q);
		y = b;
		y.compute(r,z);
	}
}
