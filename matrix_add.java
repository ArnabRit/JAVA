//print a matrix in and add 2d array 
import java.util.Scanner;
class abc
{
	int i,j,n,m,p,q,x,y;
	void xyz()
	{
		Scanner s = new Scanner (System.in);
		System.out.println("\n enter the row and the column number = ");
		n = s.nextInt();
		m = s.nextInt();
		int a[][] = new int[n][m];
		int b[][] = new int[n][m];
		int c[][] = new int[n][m];
		System.out.println("\n Enter the first arrays elements = ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("\n the 1st matrix format is = ");
		for(p=0;p<n;p++)
		{
			for(q=0;q<m;q++)
			{
				System.out.print(a[p][q]+" ");
			}
			System.out.println();
		}
		System.out.println("\n Enter the second arrays elements = ");
		for(x=0;x<n;x++)
		{
			for(y=0;y<m;y++)
			{
				b[x][y] = s.nextInt();
			}
		}

		System.out.println("\n the 2nd matrix format is = ");
		for(p=0;p<n;p++)
		{
			for(q=0;q<m;q++)
			{
				System.out.print(b[p][q]+" ");
			}
			System.out.println();
		}
		System.out.println("\n the add two matrix format is = ");
		for(p=0;p<n;p++)
		{
			for(q=0;q<m;q++)
			{
				c[p][q]=a[p][q]+b[p][q];
				System.out.print(c[p][q]+" ");
			}
			System.out.println();
		}
	}
}
class matrix_add
{
	public static void main(String arr[])
	{
		abc o = new abc();
		o.xyz();
	}
}