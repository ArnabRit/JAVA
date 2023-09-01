import java.util.Scanner;
class swap
{
public static void main(String arr[])
{
float a,b,c;
Scanner A = new Scanner(System.in);
a = A.nextFloat();
b = A.nextFloat();
c=a;
a=b;
b=c;
System.out.println("swapped value = " +a+"  "+b);
}
}