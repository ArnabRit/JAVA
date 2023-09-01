//1.	You have to develop one application for managing Students and Teachers information. They have some common property, 
//hence you have to define a class Person. Design the application maintaining hierarchy of classes. Override the toString method to print the
//values of an object. The students and teachers information should be kept using array of objects.
import java.util.Scanner;
class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person
{
    private int studentId;

    public Student(String name, int age, int studentId)
    {
        super(name, age);
        this.studentId = studentId;
    }
    public String toString()
    {
        return super.toString() + ", Student ID: " + studentId;
    }
}

class Teacher extends Person
{
    private String subject;

    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }
    public String toString()
    {
        return super.toString() + ", Subject: " + subject;
    }
}

public class T_S
{
    public static void main(String[] R)
    {
        Scanner A = new Scanner(System.in);

        Student[] stdnts = new Student[2];
        for (int i = 0; i < stdnts.length; i++)
        {
            System.out.print("Enter student name: ");
            String sname = A.nextLine();

            System.out.print("Enter student age: ");
            int sage = A.nextInt();
            A.nextLine();

            System.out.print("Enter student ID: ");
            int sId = A.nextInt();
            A.nextLine();
            stdnts[i] = new Student(sname, sage, sId);
        }

        Teacher[] tchr = new Teacher[2];
        for (int i = 0; i < tchr.length; i++)
        {
            System.out.print("Enter teacher name: ");
            String tnm = A.nextLine();

            System.out.print("Enter teacher age: ");
            int tage = A.nextInt();
            A.nextLine();

            System.out.print("Enter teacher subject: ");
            String tsub = A.nextLine();

            tchr[i] = new Teacher(tnm, tage, tsub);
        }

        System.out.println("Students:");
        for (Student student : stdnts)
        {
            System.out.println(student);
        }

        System.out.println("\nTeachers:");
        for (Teacher teacher : tchr)
        {
            System.out.println(teacher);
        }
    }
}