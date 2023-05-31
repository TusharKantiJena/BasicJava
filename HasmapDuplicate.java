import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HasmapDuplicate {
	 public static void main(String[] args)
	    {
	 
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the String");
	        String str = sc.nextLine();
	      
	        Map<String, Integer> hashMap = new HashMap<>();
	 
//	        Spliting the words
	        String[] words = str.split(" ");
	 
	        for (String word : words) {
	 
	            Integer integer = hashMap.get(word);
	 
	            if (integer == null)
	                hashMap.put(word, 1);
	 
	            else {
	               
	                hashMap.put(word, integer + 1);
	            }
	        }
	        System.out.println(hashMap);
	    }
}
