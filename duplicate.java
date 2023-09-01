//Program to print the duplicate elements of an array
import java.util.Scanner;
class arnab 
{	
	int i,j,k,n,p;
	void abc()
	{
		Scanner A = new Scanner (System.in);
		System.out.println("\n enter the size of array = ");
		p=A.nextInt();
		int[] a = new int[p];
		System.out.println("\n enter the elements of array = ");
		for(i=0;i<a.length;i++)
			{
				a[i] = A.nextInt();
			}		
		System.out.println("\n the duplicate elements of arrays are = ");
		for(j=0;j<a.length;j++)
		{
			for(k=j+1;k<a.length;k++)
			{
				if(a[j]==a[k])
				{
					System.out.println(a[k]);
				}
			}
		}
	}
}
class duplicate
{
	public static void main(String arr[])
		{
			arnab d = new arnab();
			d.abc();
		}
}
