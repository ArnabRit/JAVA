import java.util.Scanner;
interface A
{
	int add(int a, int b);
}
interface B
{
	int sub(int a , int b);
}
class c implements A,B
{
	public int add(int a,int b)
	{
		return (a+b);
	}
	public int sub( int a,int b)
	{
		return (a-b);
	}
}
class two_interface
{
	public static void main(String Args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" give 2 numbers for addition = ");
		int p = s.nextInt();
		int q = s.nextInt();
		A obj1;
		B obj2;
		c obj3 = new c();
		obj1 = obj3;
		System.out.println("the sum is = "+obj1.add(p,q));
		System.out.println(" give 2 numbers for subtraction = ");
		int r = s.nextInt();
		int z = s.nextInt();
		obj2=obj3;	
		System.out.println("the subtraction is = " +obj2.sub(r,z));
	}
}