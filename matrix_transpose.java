import java.util.Scanner;
class abc
{	int i,j,p,q,count = 0;
	void xyz()
	{
		Scanner s = new Scanner (System.in);
		System.out.println("\n enter the row and the column number = ");
		int n = s.nextInt();
		int m = s.nextInt();
		int a[][] = new int[n][m];
		int b[][] = new int[m][n];
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
		for(p=0;p<n;p++)
		{
			for(q=0;q<m;q++)
			{
				b[q][p]=a[p][q];
			}
			
		}
		System.out.println("\n the 1st matrix format is = ");
		for(p=0;p<m;p++)
		{
			for(q=0;q<n;q++)
			{
				System.out.print(b[p][q]+" ");
			}
			System.out.println();
		}
	}
}
class matrix_transpose
{
	public static void main(String arr[])
	{
		abc o = new abc();
		o.xyz();
	}
}