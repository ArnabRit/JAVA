import java.util.Scanner;
class Split{  
public static void main(String args[]){        
 Scanner a = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String p= a.nextLine();  
String[] words=p.split("\\s");  
for(String w:words){  
System.out.println(w);  
}  
}}