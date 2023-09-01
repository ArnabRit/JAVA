//Program to left rotate the elements of an array
import java.util.Scanner;
class arnab 
{	
	int i,j,k,n,p,q,r;
	void abc()
	{
		Scanner A = new Scanner (System.in);
		System.out.println("\n enter the size of array = ");
		r=A.nextInt();
		int[] a = new int[r];
		System.out.println("\n enter the elements of array = ");
		for(i=0;i<a.length;i++)
			{
				a[i] = A.nextInt();
			}
		System.out.println("\n Enter the position which you want to rotate = ");
		n=A.nextInt();
		for(j=0;j<n;j++)
		{
			int count = a[0];
				for(k=0;k<a.length-1;k++)
					{
						a[k]=a[k+1];
					}
				a[k]=count;
		}
		System.out.println("\n left rotate of array is =");
		for(i=0;i<a.length;i++)
		{
			 System.out.println(a[i]);
		}
		for(p=0;p<n;p++)
		{
			count = a[a.length-1];
			for(q=a.length-1;q>0;q--)
				{
					a[q]=a[q-1];
				}
			a[0]=count;
		}
		System.out.println("\n right rotate of array is =");
		for(p=0;p<a.length;p++)
		{
			 System.out.println(a[i]);
		}		
	}
}
class left_right_rotate
{
	public static void main(String arr[])
		{
			arnab X=new arnab();
			X.abc();
		}
}
