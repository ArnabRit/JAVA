import java.util.Scanner;
class area
{
int a,b,c;
area(int x)
{
a=x;
}
void cal_area()
{
int A;
A= a*a;
System.out.println("\n the area of the square is: "+A);
}
area(int y,int z)
{
b=y;
c=z;
}
void call_area()
{
int B;
B=b*c;
System.out.println("\n the area of the rectangle is :"+ B);
}
}
class area_value
{
public static void main(String arr[])
{
int p,q,r;
Scanner M= new Scanner(System.in);
System.out.println("enter the number = ");
p=M.nextInt();
q=M.nextInt();
r=M.nextInt();
area p1=new area(p);
area p2=new area(q,r);
p1.cal_area();
p2.call_area();
}
}
