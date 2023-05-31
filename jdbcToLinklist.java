import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 class LinkedListt {
	  Node head = null;
	  
	    class Node{
	        
	        Node next;
	        int data;
	        
	        Node(int x) // parameterized constructor
	        {   
	        	
	            data = x;
	            next = null;
	        }
	        Node(String x) // parameterized constructor
	        {   String data;
	            data = x;
	            next = null;
	        }
	    }
	    public Node insertStart(int data)
	    {
	        
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;

	        return head;
	    }

	    public void insertLast(int data)
	    {
	       
	        Node newNode = new Node(data);

	        if(head==null)
	        {
	            head = newNode;
	            return;
	        }

	        Node temp = head;

	        while(temp.next!=null)
	            temp = temp.next;

	        temp.next = newNode;

	    }
	    public void insertLast1(String data)
	    {
	       
	        Node newNode = new Node(data);

	        if(head==null)
	        {
	            head = newNode;
	            return;
	        }

	        Node temp = head;

	        while(temp.next!=null)
	            temp = temp.next;

	        temp.next = newNode;

	    }
	    public void display()
	    {   
	        Node node = head;
	       
	        while(node!=null)
	        {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	        System.out.println();
	    }
	    public int calcSize(Node node){
	        int size = 0;
	       
	        while(node!=null){
	            node = node.next;
	            size++;
	        }
	        return size;
	    }
	}
public class jdbcToLinklist {
public static void main(String args[])
{
	String URL="jdbc:mysql://localhost:3306/demo?characterEncoding=utf8";
	String username="root";
	String password="password";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	
		Connection con = DriverManager.getConnection(URL,username,password);
	
		Statement stat = con.createStatement();
		
		ResultSet resultset = stat.executeQuery("select*from employee");
	
		
		while(resultset.next()) {
			System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getInt(3));
			LinkedListt ll = new LinkedListt();
			 ll.insertLast(resultset.getInt(1));
			 ll.insertLast1(resultset.getString(2));
			 ll.insertLast(resultset.getInt(3));
			 ll.display();
		}
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
