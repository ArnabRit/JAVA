import java.util.Scanner;
class num
{
int a,b,c;
void largest()
{Scanner A=new Scanner(System.in);
a=A.nextInt();
b=A.nextInt();
c=A.nextInt();
if(a>b&&a>c)
{
System.out.println(a);
}
else if(b>a&&b>c)
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
}
class largestno
{
public static void main(String arr[])
{
num B=new num();
B.largest();
}
}