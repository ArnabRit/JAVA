import java.util.Scanner;
import java.lang.Math;
class sp
{
int a;
double b,c;
sp(int x)
{
a=x;
}
void square()
{
int A;
A=a*a;
System.out.println("\n Square of the number = "+A);
}
sp(double y,double z)
{
b=y;
c=z;
}
void power()
{
double B;
B=Math.pow(b,c);
System.out.println("\n power of the number = "+B);
}
}
class s_p
{
public static void main(String arr[])
{
int x;
double y,z;
Scanner M = new Scanner( System.in);
System.out.println("Enter the number for square = ");
x=M.nextInt();
System.out.println("Enter the number  = ");
y=M.nextDouble();
System.out.println("Enter the number for power  = ");
z=M.nextDouble();
sp P1= new sp(x);
sp P2= new sp(y,z);
P1.square();
P2.power();
}
}