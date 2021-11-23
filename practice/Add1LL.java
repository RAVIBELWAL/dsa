
import java.util.*;

public class Main
{   
	
	static class Add1LL{
	int val;
    node next;
    node prev;
       node(int val)
	     {this.val=val;
	      this.next=null;
	      this.prev=null;}
	  }
	
    public static node head;
    
    static void addNode(int value)
    {
        node newNode=new node(value);
        if(head==null)
          {head=newNode;  return;}
        
        node curr=head;
        head = new node(value);
        head.next = curr;
        curr.prev = head;
        return;     
    }
    
    
    static void display()
    {
    	node temp=head;
    	while(temp!=null)
    	{	System.out.print(temp.val+" ");
    		temp=temp.next;
    	}
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    while(n>0)
	    {//System.out.println(n%10);
	       addNode(n%10);
	        n=n/10;
	    }
	   sc.close();
	   
		node curr=head;
		while(curr.next!=null){curr=curr.next;}
		
		node temp=null;
		if(curr.val!=9) {curr.val=curr.val+1;}
		else{
			while(curr!=null&&curr.val==9)
			{
				curr.val=0;
				temp=curr;
				curr=curr.prev;
			}
			if(curr!=null)
				curr.val=curr.val+1;
			else {
				head=new node(1);
				head.next=temp;
				temp.prev=head;
			}
		}
		display();
	}
	
}

