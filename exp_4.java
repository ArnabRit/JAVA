import java.util.Scanner;
class Shape {
	int a,b;
   public void display() {
	Scanner s = new Scanner(System.in);
      System.out.println("enter the 1st length = ");
	a = s.nextInt();
      System.out.println("enter the 2nd length = ");
	b = s.nextInt();	
   }
}
class Rectangle extends Shape {
	int c;
   public void area() {
	c = a*b;
      System.out.println("The area  is = "+c);
   }
}
class Cube extends Rectangle {
int d;
   public void volume() {
	d = c*c;
      System.out.println("the square of the area is = "+d);
   }
}
class exp_4 {
   public static void main(String[] arguments) {
      Cube cube = new Cube();
      cube.display();
      cube.area();
      cube.volume();
   }
}