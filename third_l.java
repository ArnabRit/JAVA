//Java Program to find Third Largest Number in an Array
import java.util.Scanner;
class arnab 
{	
	int i,j,k,n,temp = 0,p,q,min, max,count = 3,timer=3;
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
		max = a[0];
		if(count>0)
		{
			for(j=0;j<a.length;j++)
			{
				if(max>a[j])
				{
					max = a[j];
					count--;
				}
			}
		}
		System.out.println("\n the 3rd largest element in array is = "+min);
		min = b[0];
		while(timer==0)
		{
			for(k=0;k<b.length;k++)
			{
				if(min<b[j])
				{
					min = b[j];
					timer--;
				}
			}
		}
		System.out.println("\n the 3rd largest element in array is = "+max);
	}
}
class third_l
{
	public static void main(String arr[])
		{
			arnab X=new arnab();
			X.abc();
		}
}