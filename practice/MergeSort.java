import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int arr[]= {1,5,4,3,7,8,3};
	 int n=arr.length;
	 int[] temp=new int[n];
	 
	 mergeSorts(arr, temp,0,n-1);
	 System.out.println(Arrays.toString(arr));
}

public static void mergeSorts(int []arr, int temp[], int l, int r) 
{	
	if(l<r)
	{
		int mid=(l+r)/2;
		mergeSorts(arr, temp, l, mid);
		mergeSorts(arr, temp, mid+1, r);
		merge(arr,temp,l,mid,r);
	}
}

public static void merge(int[] arr, int[] temp, int start, int end, int rightend)
	{
		int i= start;
		int j= end+1;
		int k=start;
		
		while (i<=end && j<=rightend) {
			if(arr[i]<=arr[j])	
				temp[k++]=arr[i++];
			else
				temp[k++]=arr[j++];
		}
		
			while (i<=end) {
				temp[k++]=arr[i++];
			}
			
			while (j<=rightend) {
				temp[k++]=arr[j++];			
			}
			
			
			for(int m=start; m<=rightend;m++)
			{arr[m]=temp[m];}
		}
}
