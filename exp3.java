//Write a Java program to create a super class Vehicle having members, company name and price.
//Derive two different classes LightMotorVehicle (members – mileage) and HeavyMotorVehicle (members – capacity-in-tons).
//Accept the information for n vehicles and display the information in appropriate form. While taking data,
//ask the user about the type of vehicle first. Each vehicle should have a unique number starting from 100001.
//This number should be generated at the time of instantiation.

import java.util.Scanner;

class Vehicle
{
    private static int nextVehicleNumber = 100001;

    protected int vehicleNumber;
    protected String companyName;
    protected double price;

    public Vehicle(String companyName, double price)
    {
        this.vehicleNumber = nextVehicleNumber++;
        this.companyName = companyName;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Company Name: " + companyName);
        System.out.println("Price: " + price);
    }
}

class l_vehicle extends Vehicle
{
    private double mileage;

    public l_vehicle(String companyName, double price, double mileage)
    {
        super(companyName, price);
        this.mileage = mileage;
    }

    public void display()
    {
        super.display();
        System.out.println("Mileage: " + mileage);
    }
}

class h_vehicle extends Vehicle
{
    private double capacityInTons;

    public h_vehicle(String companyName, double price, double capacityInTons)
    {
        super(companyName, price);
        this.capacityInTons = capacityInTons;
    }

    public void display()
    {
        super.display();
        System.out.println("Capacity in Tons: " + capacityInTons);
    }
}

public class exp3
{
    public static void main(String[] R)
    {
        Scanner A = new Scanner(System.in);

        System.out.print("Enter the number of vehicles: ");
        int n = A.nextInt();

        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter the type of vehicle (1 for Light Motor Vehicle, 2 for Heavy Motor Vehicle): ");
            int vehicleType = A.nextInt();
            A.nextLine();

            System.out.print("Enter company name: ");
            String cmpny = A.nextLine();

            System.out.print("Enter price: ");
            double price = A.nextDouble();

            if (vehicleType == 1)
            {
                System.out.print("Enter mileage: ");
                double mileage = A.nextDouble();
                vehicles[i] = new l_vehicle(cmpny, price, mileage);
            }
            else if (vehicleType == 2)
            {
                System.out.print("Enter capacity in tons: ");
                double capacity_Tons = A.nextDouble();
                vehicles[i] = new h_vehicle(cmpny, price, capacity_Tons);
            }
        }

        System.out.println("\nVehicle Information:");
        for (Vehicle vehicle : vehicles)
        {
            vehicle.display();
            System.out.println();
        }
    }
}