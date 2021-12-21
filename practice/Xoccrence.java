/*
 o(n*n)
 input 5 5 
 o/p 2
 
 input 10 13
 o/p 0
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Xoccrence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	Map<Integer, Integer> map= new HashMap<>(); 
	
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=n; j++) {
			//System.out.print(i*j+" ");
			
			if(map.containsKey(i*j))
			{int freq=map.get(i*j);
			map.replace(i*j, ++freq);}
			
			else
			map.put(i*j, 1);
		} }
		
		System.out.println(((!map.containsKey(m)?"0":map.get(m))));
	}
}
