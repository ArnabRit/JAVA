//print a matrix in 2d array 
import java.util.Scanner;
class abc
{
	int i,j,n,m,p,q;
	void xyz()
	{
		Scanner s = new Scanner (System.in);
		System.out.println("\n enter the row and the column number = ");
		n = s.nextInt();
		m = s.nextInt();
		int[][] a = new int[n][m];
		System.out.println("\n Enter the elements = ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("\n the matrix format is = ");
		for(p=0;p<n;p++)
		{
			for(q=0;q<m;q++)
			{
				System.out.print(a[p][q]+" ");
			}
			System.out.println();
		}
	}
}
class matrix_print
{
	public static void main(String arr[])
	{
		abc x = new abc();
		x.xyz();
	}
}