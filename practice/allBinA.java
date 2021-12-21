package more;

import java.util.Scanner;

public class allBinA {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String s1=sc.next();
	String s2=sc.next();
	
	boolean notPresent=false;
	
	int l=s2.length();
	
	for(int i=0;i<l;i++)
	{	char c=s2.charAt(i);
		String check=""+c;
		
		if(!s1.contains(check))
		{notPresent=true;  break;}
	}
	
	System.out.println((notPresent?"flase":"true"));
	
}
}


/** abcd
  bc
  true **/

