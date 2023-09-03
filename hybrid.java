// implement a multiple inheritance
import java.util.Scanner;
class Student
{
	int roll;
	void getrollnumber(int n)
	{
		roll = n;
		System.out.println(" Roll no is : " + roll);
	}
}
class test extends Student
{
	float sub1, sub2;
	void getmarks(float x , float y)
	{
		sub1 = x;
		sub2 = y;
		System.out.println("Marks obtained =" +"\n"+" subject 1 = "+sub1+"\n"+"subject 2 = "+sub2);
	}
}
interface sports
{
	final static float s = 8.0F;
	void abc();
}
class result extends test implements sports
{
	float total;
	public void abc()
	{
		System.out.println(" sports wt = "+ s);
		total = sub1+sub2+s;
		System.out.println(" total score is = "+total);
	}
}
class hybrid
{
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		System.out.println(" enter the roll number = ");
		int p = x.nextInt();
		System.out.println("enter the marks of two subjects = ");	
		float q = x.nextFloat();
		float r = x.nextFloat();
		result z = new result();
		z.getrollnumber(p);
		z.getmarks(q,r);
		z.abc();
	}
}
// 2 interface a and b in a inter face make a method return add in b class int sub make a final class c its implements a ,b then take input and make object 1 2 and 3 then call