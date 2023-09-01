import java.util.Scanner;
class i_array
{
int b,c,i,n,p;
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
p=-1;
System.out.println("\n Enter the search value = ");
b = A.nextInt();
for(i=0;i<a.length;i++)
{
if(a[i]==b)
{
c = a[i];
p=i;
break;
}
}
if(p!=-1)
{
System.out.println("\nthe value "+ " " + c +" found at position "+" "+p);
}
else
{
System.out.println("\nthe value not found in the array ");
}
}
}
class search_array
{
public static void main(String arr[])
{
i_array X = new i_array();
X.small();
}
} 


