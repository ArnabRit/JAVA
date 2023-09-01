//Java Program to print the sum of all the items of the array
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
		int sum = 0;
		for(j=0;j<a.length;j++)
		{
			sum = sum +a[j];
		}
		System.out.println ("\n the sum of arrays elements are = "+sum);
	}
}
class sum_array
{
	public static void main(String arr[])
		{
			arnab d =new arnab();
			d.abc();
		}
}	