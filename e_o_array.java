import java.util.Scanner;
class k_array
{
	int i,j,k,n,p,q;
	void small()
	{
		Scanner A = new Scanner(System.in);
		System.out.println("\n enter the size of array = ");
		n = A.nextInt();
		int [] a = new int [n];
		int [] b = new int[n];
		int [] c = new int [n];
		System.out.println("\n Enter the elements of arrays = ");
		for( i= 0; i< a.length;i++)
		{
 		a[i]=A.nextInt();
		}
		for(j=0;j<b.length;j++)
		{
			if(a[j]%2==0)
			{
			b[q]=a[j];
			q++;
			}
		}
		for(k=0;k<c.length;k++)
		{
			if(a[k]%2!=0)
			{
				c[p]=a[k];
				p++;
			}
		}
		System.out.println("\n the elements are = ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n the even elements are = ");
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println("\n the odd elements are = ");
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
class e_o_array
{ 
	public static void main(String arr[])
	{
		k_array X = new k_array();
		X.small();
	}
}

