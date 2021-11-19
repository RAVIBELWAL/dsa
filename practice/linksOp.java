package Link;

import java.util.*;
import java.lang.*;
public class linksOp
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        boolean check=true;
        do
        {
            System.out.println(" Enter Operation No. You Wants To Perform\n\t1.Insert\n\t2.Insert At\n\t3.Delete\n\t4.Delete Node Number\n\t5.Length Of List\n\t6.Reverse List\n\t7.Swap Nodes At x & y\n\t8.Sort List\n\t9.Display List\n\t10.Exit" );
            int op=sc.nextInt();
            switch(op)
            {
            case 1:{
        	    System.out.println("Enter the node value ");
        	    int val=sc.nextInt();
                insert(val);
                break;}
                
            case 2:{
	            System.out.println("Enter the node value ");
	    	    int val=sc.nextInt(); 
	    	    System.out.println("Where you wants to insert ?");
	    	    int Index=sc.nextInt();
                insertAt(val,Index);
                break;}
                
            case 3:{
                delete();
                break;
            }
            
            case 4:{
	            System.out.println("Enter number of node you want to delete");
	    	    int index=sc.nextInt();             	
                deleteNode(index);
                break;}
            
            case 5:{
                length();
                break;}
            
            case 6:{
                reverse();
                break;}
            
            case 7:{
            	System.out.print("Enter position of nodes to be swaped 1st : ");
            	int first=sc.nextInt();
            	System.out.print("2nd Position : ");
            	int second=sc.nextInt();
                swap(first,second);
                break;}
            
            case 8:{
                sort();
                break;}
            
            case 9:{
                display();
                break;}
            
            case 10:{
                check=false;
                break;}
            default:{System.out.println("\nOh Wrong input");}
            }
        }
        while(check);
        System.out.println("Ok exited ...bye");
	}
	
	//----------------------------------------------
	public static class node
	{
	    int value;
	    node next;          //points to new memory location or simply say pointer to next node
	    
	     		//empty constructor
	    node(){ //System.out.println("hey ! I ran");
	    }
	    
	    node(int value){this.value=value;} // constructor with value
	    
	    node(int value,node next){this.value=value; this.next=next; } 
	}
	//----------------------------------------------
	

	static node head; //creating a node with name head , root node
	
	//-----------------------------------------------
	    public static void insert(int val)
	{    
	    node newNode=new node(); //new node
	    newNode.value=val;
	    
	    if(head==null)
	    {head=newNode; display(); return;}
	    
	    node temp=head;
	    while(temp.next!=null)
	    {
	    	temp=temp.next;
	    }
	    temp.next=newNode;
	    
	    display();
	}
	
	
		public static void insertAt(int val,int index)
	{
		node newNode=new node();//new node to be added
		
		newNode.value=val; //assigning value to node
	
		if(head==null)  //list is empty
		{
			head=newNode; display();
		}
		
		if(index==1) //at first or head node position
		{
		newNode.next=head;	
		head=newNode;
		}
		
		else //other than one/initial
		{node temp=head; 
		 for(int i=1;i<index-1;i++)
		 	{
			 temp=temp.next;
		 	}
		 newNode.next=temp.next;
		 temp.next=newNode;
		}
	    
		display();
	}
	
	//----------------------------------------------
	
		public static void delete()
	{
		node temp=head;
		node prevtemp=head;
		
		if(head==null)
		{System.out.println("*No node in list..!!");}
		
		if(temp.next==null)
		{head=null;}
		
		else{
			while(temp.next!=null)
				{	
					prevtemp=temp;
					temp=temp.next;
				}
				prevtemp.next=null;
				System.out.println("Last node deleted => "+prevtemp.value);
			}
		display();
	}
	
	
		public static void deleteNode(int index)
	{
		node temp=head;
		
		if(head==null)
		{System.out.println("*No node in list..!!");}
		
		if(index==1)
		{
		 head=temp.next;
		}
		
		else
		{
			for(int i=2;i<=index-1;i++)
			{
				if(temp.next.next==null)
				{	System.out.println("*There is no node at the entered position..!!");
					return;
				}
				else {
					temp=temp.next; 	//inserting next node one by one to temp
				}
			}
			temp.next=temp.next.next;
		}
		display();	    
	}
	
	
		public static void length()
	{	
		node temp=head;
		if(temp==null) {System.out.println(" '0' Link is empty..!!!");return;}
		int count=0;
		while(temp!=null)
		{count++;
    	temp=temp.next;
	    }
	    System.out.println("Current length of list is : "+count);    
	}
	
	
		public static void reverse()
	{
			System.out.println("Current working on this..");      
	}
	
	
		public static void swap(int f, int s)
	{	
		if(head==null)return;
		if(f==s) {System.out.println("Swap positions are same..");return;}	
		
		node prevNode1 = null, prevNode2 = null, node1 = head, node2 = head; 
		
		 while(node1 != null && node1.value != f){  
	            prevNode1 = node1;  
	            node1 = node1.next;  
	        }  
		 
	      while(node2 != null && node2.value != s){  
	            prevNode2 = node2;  
	            node2 = node2.next;  
	        }  
	  
	        if(node1 != null && node2 != null) {  
	                          
	            if(prevNode1 != null)  
	                prevNode1.next = node2;          
	            else  
	                head  = node2;  
	              
	            if(prevNode2 != null)  
	                prevNode2.next = node1;  
	            else  
	                head  = node1;  
	              
	            node temp = node1.next;   
	            node1.next = node2.next;   
	            node2.next = temp;       
	        }
	        else {  
	            System.out.println("Swapping is not possible");  
	        }  
	      
	   display();
	}
	
	
		public static void sort()
	{
			System.out.println("Current working on this..");   
	}
	
	
		public static void display()
	{
	    node temp=head;
	    if(temp==null) {System.out.println("Nothing to display ...Link is empty..!!!");return;}
	    System.out.println("...............................................\nCurrent List");
	    while(temp!=null)
	    {
	    	System.out.print( temp.value+">");
	    	temp=temp.next;
	    }
	    System.out.print("\n...............................................");
	    System.out.println("");    
	}
	
}
