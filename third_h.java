//Java Program to find Third Largest Number in an Array
import java.util.Scanner;
class abc
{
	int i,j,n,p,q,temp=0;
	void xyz()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		n=s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of array = ");
		for(p=0;p<a.length;p++)
			{
				a[i] = s.nextInt();
			}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
	q=a[n];
	System.out.println("the 3rd largest number is = "+q);
	}
}
class third_h
{
	public static void main(String args[])
	{
		abc x= new abc();
		x.xyz();
	}
}