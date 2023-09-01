import java.util.Scanner;
class number
{
 int a,b,c,d;
void highest()
{
Scanner A=new Scanner(System.in);
System.out.println("enter the 1 st number = ");
a=A.nextInt();
System.out.println("enter the 2 st number = ");
b=A.nextInt();
if(a>b)
{
c=a/b;
System.out.println("the result is ="+" "+c);
}
else
{
d=b/a;
System.out.println("the result is ="+" "+d);
}
}
}
class div_number
{
public static void main(String arr[])
{
number A= new number();
A.highest();
}
}
