
import java.util.Scanner;

public class ReverseJava {
	 
	public static void main(String args[])  
	{  
	String a;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter a String: ");  
	a=sc.nextLine();                  
	
	System.out.print("After reverse string is: "); 
	
	for(int i=a.length(); i>0; --i)              
	{  
	   System.out.print(a.charAt(i-1));            
	}  
	
	}  
}