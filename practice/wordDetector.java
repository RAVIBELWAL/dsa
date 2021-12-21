
/*check if all char of B are in A are same or not
 abcde
 abc
 o/p:true
 
 abcde
 abf
 o/p : fasle
*/

/*   1.O(n*n)
     2.O(n)
*/


// O(n*n)

import java.io.*;
import java.util.*;
public class wordDetector {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int count = 0;
        for(int i=0;i<s2.length();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                if(s1.charAt(j)==s2.charAt(i))
                {
                    count++;
                    break;
                }
            }
        }
        if(count==s2.length())
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}


///O(n)

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String s1=sc.next();
	String s2=sc.next();
	
	boolean Present=true;
	int count=0;
	
	for(int i=0;i<s2.length();i++)
	{	char c=s2.charAt(i);
		String check=""+c;
		
		if(!s1.contains(check))
		{Present=false; break;}
		
		count++;
	}
	
	if(count!=s2.length())
	{Present=false;}
	
	System.out.println((Present?"true":"false"));
	
}
}


///------
