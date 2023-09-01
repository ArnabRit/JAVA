import java.util.Scanner;
class a_array
{
public static void main(String arr[])
{
 int n,i;
Scanner A = new Scanner(System.in);
System.out.println("\n enter the size of array = ");
n = A.nextInt();
int [] a = new int [n];
System.out.println("\n Enter the elements of arrays = ");
for( i= 0; i< a.length;i++)
{
 a[i]=A.nextInt();
}
for( i = 0; i< a.length;i++)
{
System.out.println("\n  the elements of arrays are = "+ i+" "+a[i]);
}
}
}