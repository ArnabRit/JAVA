//stack
import java.util.Scanner;
class abc
{
	int option;
	void xyz()
	{
		do
		{
			System.out.println("\n 1. push = " );
			System.out.println("\n 2. pop = " );
			System.out.println("\n 3. display = " );
			System.out.println("\n Enter your option = " );
			Scanner a = new Scanner(System.in);
			option =a.nextInt();
			switch(optioin)
			{
				case 1: push A = new push();
					A.p();
					break;
				case 2: pop A = new pop();
					A.q();
					break;
				case 3: display A = new display();
					A.r();
					break;
				default : System.out.println("Enter a valid option");
			}
		}
		while(option!=4);
	}
}
class stack_op
{
	public static void main(String args[])
	{
		abc o =new abc();
		o.xyz();
	}
}

			



