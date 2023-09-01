import java.util.Scanner;
class leapyear
{
int a;
void show(int x)
{
a=x;
if(a%100==0)
{
if(a%400==0)
{
System.out.println(" yes the year is leap year"+"  "+a);
}
else
{
System.out.println(" no the year is not leap year"+"  "+a);
}
}
else
{
if(a%4==0)
{
System.out.println(" yes the year is leap year"+"  "+a);
}
else
{
System.out.println(" no the year is not leap year"+"  "+a);
}
}
}
}
class year
{
public static void main(String arr[])
{
int x;
Scanner S = new Scanner( System.in);
System.out.println(" Enter the year = ");
x=S.nextInt();
leapyear A = new leapyear();
A.show(x);
}
}