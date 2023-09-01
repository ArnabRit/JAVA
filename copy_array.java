//Program to copy all elements of one array into another array
import java.util.Scanner;
class arnab
{
int i,j,k,n;
void abc ()
{
Scanner A = new Scanner (System.in);
System.out.println("\n enter the size of array = ");
n = A.nextInt();
int [] a = new int [n];
int [] b = new int [n];
System.out.println("\n enter the elements = ");
for(i=0;i<a.length;i++)
{
a[i]=A.nextInt();
}
for(j=0;j<b.length;j++)
{
b[j]=a[j];
}
System.out.println("\n The final array is  = ");
for(k=0;k<b.length;k++)
{
System.out.println(b[k]);
}
}
}
class copy_array
{
public static void main(String arr[])
{
arnab B = new arnab();
B.abc();
}
}
