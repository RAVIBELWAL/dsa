package learn;
import java.util.*;

public class mergeSort {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	     
	    mergeSort(arr,0,arr.length-1);
	    
	    printArray(arr);
	}
	
	
	public static void mergeSort(int arr[],int start, int end)
	{   if(start<end)               // if array has more then 1 elements
	    {//find mid to divide arr
	    int mid=(start+end)/2;      
	   
	     // Sort first and second halves
	    mergeSort(arr,start,mid);
	    mergeSort(arr,mid+1,end);
	    // Merge the sorted halves
	    merge(arr,start,mid,end);
	    }
	}
	
	public static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

	
	    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
}
