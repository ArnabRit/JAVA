import java.util.Scanner;
class p_array
{
int b,c,i,n,min;
void small()
{
Scanner A = new Scanner(System.in);
System.out.println("\n enter the size of array = ");
n = A.nextInt();
int [] a = new int [n];
System.out.println("\n Enter the elements of arrays = ");
for( i= 0; i< a.length;i++)
{
 a[i]=A.nextInt();
}
min = a[0];
for(i=0;i<a.length;i++)
{
if(a[i]<min)
{
min = a[i];
}
}
System.out.println("\n The smallest element of the array is = "+" "+min);
}
}
class smallest_array
{
public static void main(String arr[])
{
p_array X = new p_array();
X.small();
}
} 

