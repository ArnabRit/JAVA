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
				if(a[p][q]==0)
				count ++;
			}
			System.out.println();
		}
		int div = (m*n)/2;
		if(count>div)
		{System.out.println("sparse matrix");
		}else
		{System.out.println("not parse matrix");}	
	}
}
class matrix_parse
{
	public static void main(String arr[])
	{
		abc o = new abc();
		o.xyz();
	}
}
		