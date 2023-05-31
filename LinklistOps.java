

class LinkedList {
	
	    Node head = null;
	  
	    class Node{
	        int data;
	        Node next;

	        Node(int x) // parameterized constructor
	        {
	            data = x;
	            next = null;
	        }
	        Node(String x) // parameterized constructor
	        {    String data;
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
	    public void deleteStart()
	    {
	        if (head == null){
	            System.out.println("List is empty, not possible to delete");
	            return;
	        }

	        System.out.println("Deleted: " + head.data);
	        head = head.next;
	    }
	    public void deleteLast()
	    {
	        if (head == null){
	            System.out.println("List is empty, not possible to delete");
	            return;
	        }

	      
	        if(head.next == null)
	        {
	            System.out.println("Deleted: " + head.data);
	            head = head.next;
	        }
	        Node previous = null;
	        Node temp = head;
	      
	        while (temp.next != null)
	        {
	            
	            previous = temp;
	            temp = temp.next;
	        }
	       
	        System.out.println("Deleted: " + temp.data);
	        previous.next = null;
	   

	    }

	    public void insertPosition(int n,int data)
	    {
	        int size = calcSize(head);

	        if(n < 1 || n > size)
	        {
	            System.out.println("Can't insert");

	        }
	        else
	        {
	            Node newNode = new Node(data);
	            Node temp = head;

	            while(--n > 0)
	                temp=temp.next;

	            newNode.next= temp.next;
	            temp.next = newNode;
	           
	        }
	    }
	    public void deleteNthNode(int n)
	    {
	        int len = calcSize(head);
	        
	        if(n < 1 || n > len)
	        {
	            System.out.println("Can't delete");

	        }
	        else
	        {
	            if(n == 1)
	            {
	                System.out.println("Deleted: " + head.data);
	                head = head.next;
	                return;
	            }
	            
	            Node temp = head;
	            Node previous = null;
	            while(--n > 0) {
	                previous = temp;
	                temp = temp.next;
	            }
	          
	            previous.next = temp.next;
	            System.out.println("Deleted: " + temp.data);
	        }
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

		public void insertLast1(String data) {
           
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
	}
	public class LinklistOps {
	public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insertStart(3);
        ll.insertStart(2);
        ll.insertStart(1);

        ll.display();

        ll.insertLast(5);
        ll.insertLast(6);
        ll.insertLast(7);
        ll.insertLast(8);

        ll.display();

        //Inserts after 3rd position
        ll.insertPosition(3,25);

        ll.display();
        
        ll.deleteStart();
        ll.display();

        ll.deleteLast();
        ll.display();

        ll.deleteNthNode(3);
        ll.display();
    }
}
