import java.util.Scanner;
class sign
{
float a;
sign(float x)
{
a=x;
}
void result()
{
if (a>0.0)
{
System.out.println("the number is positive = "+a);
}
else
{
System.out.println("the number is negative = "+a);
}
}
}
class sign_number
{
public static void main(String arr[])
{
float x;
Scanner S= new Scanner(System.in);
System.out.println("\n enter the number = ");
x=S.nextFloat();
sign A= new sign(x);
A.result();
}
}