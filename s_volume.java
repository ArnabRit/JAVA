import java.util.Scanner;
class abc
{
float r,h;
double a,p,q,s;
void volume (float x, float y)
{
r=x;
h=y;
a=0.33*3.14*(r*r)*h;
System.out.println("\n the volumn of cone is = "+a);
}
void volume (double c, double d)
{
p=c;
q=d;
s=3.14*(p*p)*q;
System.out.println("\n the volumn of cylinder is = "+s);
}
}
class s_volume
{
public static void main (String arr[])
{
float x,y;
double c,d;
Scanner A = new Scanner (System.in);
System.out.println("\n enter the radius = ");
x= A.nextFloat();
System.out.println("\n enter the height = ");
y= A.nextFloat();
System.out.println("\n enter the float radius = ");
c= A.nextDouble();
System.out.println("\n enter the float height = ");
d= A.nextDouble();
abc p1=new abc();
abc p2=new abc();
p1.volume(x,y);
p2.volume(c,d);
}
}