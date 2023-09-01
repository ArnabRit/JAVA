import java.util.Scanner;
class amount
{
float n,t1,a;double t_amount;
amount(float x,float y)
{
n = x; a= y;
}
void cloth_amount()
{
t1=n*a;
if(t1<=100)
{
t_amount = t1-(t1*0.05);
System.out.println("total amount is "+" "+t_amount);
}
else if(t1>100 && t1<=200)
{
t_amount = t1-((t1*0.05)+(t1*0.075));
System.out.println("total amount is "+" "+t_amount);
}
else if(t1>200 && t1<=300)
{
t_amount = t1-((t1*0.075)+(t1*0.1));
System.out.println("total amount is "+" "+t_amount);
}
else
{
t_amount = t1-((t1*0.1)+(t1*0.15));
System.out.println("total amount is "+" "+t_amount);
}
}
}
class cloth_amount_list
{
public static void main(String arr[])
{
float x; float y;
Scanner S=new Scanner(System.in);
System.out.println("enter the number of items");
x=S.nextFloat();
System.out.println("enter the amount of each item");
y=S.nextFloat();
amount ob=new amount(x,y);
ob.cloth_amount();
}
}