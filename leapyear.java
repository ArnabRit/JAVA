import java.util.Scanner;
class year
{
int a;
void show(int x)
{
a=x;
if(a%100==0)
{
if(a%400==0)
{
System.out.println("the year is leap year");
}
else
{
System.out.println("the year is not leapyear");
}
}
else
{
if(a%4==0)
{
System.out.println("the year is not leapyear");
}
else
{
System.out.println("the year is not leapyear");
}
}
}
}
class leapyear
{
public static void main(String arr[])
{
int x;
Scanner A=new Scanner(System.in);
System.out.print("the year is = ");
x=A.nextInt();
year B= new year();
B.show(x);
}
}