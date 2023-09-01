//write a java code to print roll name sub through inheritance
import java.util.Scanner;
class abc
{
String p;
int q;
void uv()
{
 Scanner a = new Scanner(System.in);
 System.out.println("Enter your name = ");
 p = a.next();
 System.out.println(" Enter your roll number = ");
 q = a.nextInt();
}
}
class xyz extends abc
{	
String r;
void xy()
{
Scanner b = new Scanner(System.in);
System.out.println("Enter the subject name = ");
r = b.next();
System.out.print("name = "+p+" "+"roll no= "+q+" "+"Subject name = "+r);
/*System.out.println("name = "+p);
System.out.println("roll = "+q);
System.out.println("sub = "+r);*/
}
}
class student_details
{

public static void main(String args[])
{
xyz s = new xyz();
s.uv();
s.xy();
}
}
