package Link;

import java.util.*;
public class linkMiddelete
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    insert(sc.nextInt());
		}
		deleteMid();
	    display();
	}
	
	public static class node{
	    int value;
	    node next;
	}
	
	public static node head; //initial node
	
	public static void insert(int val)
	{   node newNode=new node();
	    newNode.value=val;
	    if(head==null)
	    {head=newNode; return;}
	    
	    node temp=head;
	    while(temp.next!=null)
	    {
	        temp=temp.next;
	    }
	    temp.next=newNode;
	    
	}
	
	public static void deleteMid()
	{
	    if(head==null)return;
	    if(head.next==null){head=null; return;}
	    if(head.next.next==null){head=head.next; return;}
	    
	    node slow=head; //to be removed
	    node fast=head; //helper node
	    node prev=head; //node with prev link
	    
	    while(fast.next!=null&& fast.next.next!=null)
	    {	prev=slow;
	        slow=slow.next;
	        fast=fast.next.next;
	    }
	    System.out.println("removing mid node with value -> "+slow.value);
	    
	    prev.next=slow.next;
	}
	
    public static void display()
    {
        node temp=head;
        if (head==null)return;
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
	
}
