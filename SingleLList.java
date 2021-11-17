package Link;

import java.util.*;

public class SingleLList {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedL l=new LinkedL();
        		
        for(int i=0;i<n;i++)     	
        l.insert(sc.nextInt());

        l.delete(sc.nextInt());
        
        l.display();
        l.middle();
    }

    //------
}
 class node
{
    int value;
    node next;
}


class LinkedL {
	    public node head;

	    public void insert(int value) {
	        node newnode = new node();
	        newnode.value = value;

	        if (head == null) {
	            head = newnode;
	            return;
	        }
	        node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newnode;
	        return;
	    }

	    public void delete(int index) {
	        if (head == null)
	            return;
	        if (index == 0) {
	            head = head.next;
	            return;
	        }
	        node temp = head;
	        for (int i = 0; i < index - 1; i++) {
	            if (temp.next.next != null)
	                temp = temp.next;
	            else
	                break;
	        }
	        temp.next = temp.next.next;
	    }

	    public void middle() {
	        node slow = head;
	        node fast = head;

	        while (fast.next != null && fast.next.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        System.out.println(slow.value);
	    }

	    public void display() {
	        node temp = head;
	        while (temp != null) {
	            System.out.print(temp.value + " ");
	            temp = temp.next;
	        }
	        System.out.println("");
	    }
	}
