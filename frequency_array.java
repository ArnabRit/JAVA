//Program to find the frequency of each element in the array
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
System.out.println("\n enter the elements = ");
for(i=0;i<a.length;i++)
{
a[i]=A.nextInt();
}
int [] b = new int [a.length];
int visit = -1;
for(j=0;j<a.length;j++)
{
int count = 1;
for(k=j+1;k<a.length;k++)
{
if(a[j]==a[k])
{
count++;
b[k]=visit;
}
}
if(b[j]!=visit)
{
b[j]=count;
}
}
System.out.println("\n The frequencys are = ");
for(j=0;j<b.length;j++)
{if(b[j]!=visit)
{System.out.println(" "+a[j]+" "+b[j]);
}
}
}
}
class frequency_array
{
public static void main(String arr[])
{
arnab X = new arnab();
X.abc();
}
}