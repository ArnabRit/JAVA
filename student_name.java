import java.util.Scanner;
class name
{
String a;
int b;
void school()
{
Scanner S=new Scanner(System.in);
System.out.println("Enter the name = ");
a = S.nextLine();
System.out.println("Enter the roll = ");
b = S.nextInt();
System.out.println("My name is = "+" "+a+",and roll number is = "+b);
}
}
class student_name
{
public static void main(String school[])
{
name S= new name();
S.school();
}
}
