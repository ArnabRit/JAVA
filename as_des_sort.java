//Java Program to sort the elements of an array in ascending and desending order
import java.util.Scanner;
class arnab 
{	
	int i,j,k,n,temp = 0,p,q;
	void abc()
	{
		Scanner A = new Scanner (System.in);
		System.out.println("\n enter the size of array = ");
		n=A.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		System.out.println("\n enter the elements of array = ");
		for(i=0;i<a.length;i++)
			{
				a[i] = A.nextInt();
			}
		for(p=0;p<b.length;p++)
			{
				b[p]=a[p];
			}
		for(j=0;j<a.length;j++)
		{
			for(k=j+1;k<a.length;k++)
			{
				if(a[j]>a[k])
				{
					temp = a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		System.out.println("\n the ascending order sorting is = ");
		for(q=0;q<a.length;q++)
		{
			System.out.print(a[q]+" ");
		}
		for(j=0;j<b.length;j++)
		{
			for(k=j+1;k<b.length;k++)
			{
				if(b[j]<b[k])
				{
					temp = b[j];
					b[j]=b[k];
					b[k]=temp;
				}
			}
		}
		System.out.println("\n the ascending order sorting is = ");
		for(q=0;q<b.length;q++)
		{
			System.out.print(b[q]+" ");
		}
	}
}
class as_des_sort
{
	public static void main(String arr[])
	{
		arnab x = new arnab();
		x.abc();
	}
}
		