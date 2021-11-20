/*Count 1 in binary array
Sample Input:
8
1 1 1 1 1 0 0 0
Sample Output:
5
*/

import java.util.*;
public class binarySer
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    
	    Arrays.sort(arr);
	    int l=0,r=n-1;
	    int ans=count(arr,l,r);
	    System.out.print(ans);
	}
	
	public static int count(int[] arr,int l,int r)
	{   int len=arr.length;
	     int mid=l+(r-l)/2;
	    if(l<=r)
	    {
	        if(arr[mid]==1)
	        {r=mid-1;
	        l=0;
	       
	         return count(arr,l,r);     
	        }
	        else return count(arr,mid+1,r);
	    }
	        return len-mid;
	}
}
