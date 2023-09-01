//2.Define a class Employee having private members – id, name, department, salary.
//Define default and parameterized constructors. Create a subclass called Manager with private member bonus.
//Define methods display in both the classes. Create n objects of the Manager class and display the details of the manager having the
//maximum total salary (salary+bonus).

import java.util.Scanner;

class Employee
{
    private int id;
    private String nm;
    private String dpt;
    private double slr;

    public Employee()
    {
        // Default constructor
    }

    public Employee(int id, String nm, String dpt, double slr)
    {
        this.id = id;
        this.nm = nm;
        this.dpt = dpt;
        this.slr = slr;
    }

    public void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + nm);
        System.out.println("Department: " + dpt);
        System.out.println("Salary: " + slr);
    }

    public double get_sal()
    {
        return slr;
    }
}

class Manager extends Employee
{
    private double bonus;

    public Manager(int id, String nm, String dpt, double slr, double bonus)
    {
        super(id, nm, dpt, slr);
        this.bonus = bonus;
    }

    public void display()
    {
        super.display();
        System.out.println("Bonus: " + bonus);
    }

    public double total_sl()
    {
        return get_sal() + bonus;
    }
}

public class M_S
{
    public static void main(String[] R)
    {
        Scanner A = new Scanner(System.in);
        
        System.out.print("Enter the number of Managers: ");
        int n = A.nextInt();

        Manager[] mng = new Manager[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Manager " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = A.nextInt();
            A.nextLine();
            System.out.print("Name: ");
            String nm = A.nextLine();
            System.out.print("Department: ");
            String dpt = A.nextLine();
            System.out.print("Salary: ");
            double slr = A.nextDouble();
            System.out.print("Bonus: ");
            double bonus = A.nextDouble();

            mng[i] = new Manager(id, nm, dpt, slr, bonus);
        }

        Manager max = mng[0];
        for (int i = 1; i < n; i++)
        {
            if (mng[i].total_sl() > max.total_sl())
            {
                max = mng[i];
            }
        }

        System.out.println("Details of Manager with Maximum Total Salary:");
        max.display();
    }
}