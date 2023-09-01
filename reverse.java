//Program to print the elements of an array in reverse order
import java.util.Scanner;
class arnab 
{	
	int i,j,k,n;
	void abc()
	{
		Scanner A = new Scanner (System.in);
		System.out.println("\n enter the size of array = ");
		n=A.nextInt();
		int[] a = new int[n];
		System.out.println("\n enter the elements of array = ");
		for(i=0;i<a.length;i++)
			{
				a[i] = A.nextInt();
			}
		System.out.println("\n the reverse elements of arrays are = ");
		for(j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}
}
class reverse
{
	public static void main(String arr[])
		{
			arnab d =new arnab();
			d.abc();
		}
}