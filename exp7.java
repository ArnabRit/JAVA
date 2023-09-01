//7__Write a program to implement concept of method overriding.

class Animal
{
    void makeSound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    void makeSound()
    {
        System.out.println("Cat meows");
    }
}

public class exp7
{
    public static void main(String[] R)
    {
        Animal animal1 = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        animal1.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}