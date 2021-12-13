package more;

import java.util.Scanner;

public class WateringPlants {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int c=sc.nextInt();
		int arr[]=new int[n];
		
		for (int i = 0; i <n; i++) {
			arr[i]=sc.nextInt();
		}	
		
		int steps=0;
        int temp=c;
        
        for(int i=0;i<n;i++)
        {    
            if(c>=arr[i])
            {    steps++;
                int p=steps;
                //System.out.println(p);
                c-=arr[i];
            }
            
            else if(c<arr[i])
            {   int p=i+(i+1);
                steps+=i+(i+1);
                //System.out.println(p);
                c=temp;
                c-=arr[i];
            }
        }
        System.out.println(steps);
	}
}
