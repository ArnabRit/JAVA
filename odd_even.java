//Program to print the elements of an array present on even and odd position
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
		System.out.println("\n the even positions elements of arrays are = ");
		for(j=1;j<a.length;j=j+2)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println("\n the odd positions elements of arrays are = ");
		for(j=0;j<a.length;j=j+2)
		{
			System.out.print(a[j]+" ");
		}
	}
}
class odd_even
{
	public static void main(String arr[])
		{
			arnab d =new arnab();
			d.abc();
		}
}