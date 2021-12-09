//Hashing for Pair Solution
import java.util.Arrays;
import java.util.Scanner;
public class hashing {           //o(n^2) solution
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=sc.nextInt();
	
	int arr[]=new int[n];
	for (int i = 0; i <n; i++)
	{	System.out.print(i+" ");
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	
	int l=0, r=n-1,ans=0;
		while(l<r)			      //sliding window O(n) use binary after sorting 0(logn) or use merge sort for n(logn)
		{
			if(arr[l]+arr[r]==sum)
			{ans=1; break;}
			
			else if(arr[l]+arr[r]<sum)
			l++;
			
			else r--;
		}
		
		System.out.println(ans);
		sc.close();
}
}
