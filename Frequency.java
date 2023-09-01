import java.util.Scanner;
class free { int n,k,i,j;  
    	void abc(){  
	Scanner A = new Scanner (System.in);
	System.out.println("\n enter the size of array = ");
	n = A.nextInt();
        int [] arr = new int [n] ; 
        System.out.println("\n enter the elements = ");
	for(k=0;k<arr.length;k++)
	{
	arr[k]=A.nextInt();
	} 
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }}
class Frequency
{
public static void main(String arr[])
{
free X = new free();
X.abc();
}
} 