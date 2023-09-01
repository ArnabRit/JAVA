import java.util.Scanner;
class S_B{  
public static void main(String args[]){  
StringBuffer p=new StringBuffer("Hello ");  
p.append("Java");
System.out.println(p);
p.insert(1,"Java");
System.out.println(p);
p.replace(1,3,"Java");  
System.out.println(p);
p.delete(1,3);  
System.out.println(p);
p.reverse();  
System.out.println(p);
p.append("Hello");
System.out.println(p.capacity());
p.append("java is my favourite language");  
System.out.println(p.capacity()); 
p.ensureCapacity(10);  
System.out.println(p.capacity());  
p.ensureCapacity(50);  
System.out.println(p.capacity());
}  
} 