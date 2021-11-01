package sorting;

import java.util.*;
public class bubbleSort
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int flag=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int i, j, temp,count=0;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
    
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    count++;
                }
            }
 
            if (swapped == false)
                break;
        }
        
            // for (i = 0; i < n; i++)
            // System.out.print(arr[i] + " ");
        System.out.print("Array is sorted in "+ count + " swaps.\nFirst Element: "+arr[0]+"\nLast Element: "+arr[n-1]);
        
	}
}
