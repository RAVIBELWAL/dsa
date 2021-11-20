import java.util.*;
public class dLinkedList
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
    for(int i=1;i<=n;i++)
        insert(sc.nextInt());
        
        insertAtHead(k);
	}
	
	public static class node{
	    int val;
	    node next;
	    node prev;}
	
	
	    public static node head;
	    
	    public static void insert(int num)
	    {   node newNode=new node();
	        newNode.val=num;
	        node temp=head;
	        if(temp==null)
	        {
	            newNode.prev=null;
	            head=newNode;
	            return;
	        }
	        
	        
	        while(temp.next!=null)
	        {
	            temp=temp.next;
	        }
	        
	        temp.next=newNode;
	        temp.prev=temp;
	        
	    }
	    
	    
	    public static void insertAtHead(int num)
	    {
	        node newNode=new node();
	        newNode.val=num;
	        node temp=head;
	        if(head==null)
	        {head=newNode;
	            return;}
	            
	        else{
	            head.prev=newNode;
	            newNode.next=head;
	            newNode.prev=null;
	            head=newNode;
	            
	        }
	        display();
	    }
	    
	    public static void display()
	    {   node temp=head;
	        if(head==null)return;
	        while(temp!=null)
	        {
	        System.out.print(temp.val+" ");
	        temp=temp.next;
	        }
	    }
	    
}
