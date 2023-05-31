import java.util.Scanner;

public class duplicateChar {

	public static void main(String[] args) {
		  // diclare a string and for count the duplicate we i declared a int 
		
		System.out.println("Please Enter the string");
		
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine(); 

	        int count;  
	          
	        //Converting the string to char 
	        
	        char str1[] = str.toCharArray();  
	          
	        System.out.println("Duplicate characters in a given string: ");  
	        
	        //Counts each character present in the string  
	        
	        for(int i = 0; i <str1.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <str1.length; j++) {  
	                if(str1[i] == str1[j] && str1[i] != ' ') {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    str1[j] = '0';  
	                }  
	            }  
	            
	            //A character is considered as duplicate if count is greater than 1  
	            if(count > 1 && str1[i] != '0')  
	                System.out.println(str1[i]+"-"+count);  
	        }  
	}

}