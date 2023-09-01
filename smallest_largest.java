//Program to print the largest and smallest element in an array
import java.util.Scanner;
class arnab 
{	
	int i,j,k,n,count;
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
		count=a[0];
		System.out.println("\n the largest elements of arrays are = ");
		for(j=0;j<a.length;j++)
		{
			if(count<a[j])
			count = a[j];	
		}
		System.out.print(count);
		count = a[0];
		System.out.println("\n the smallest elements of arrays are = ");
		for(j=0;j<a.length;j++)
		{
			if(count>a[j])
			count = a[j];
			
		}
		System.out.print(count);
	}
}
class smallest_largest
{
	public static void main(String arr[])
		{
			arnab d =new arnab();
			d.abc();
		}
}