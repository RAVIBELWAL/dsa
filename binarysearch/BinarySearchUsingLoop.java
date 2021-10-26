package dsa.binarysearch;

public class BinarySearchUsingLoop {
public static void main(String[] args)
	{
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int number=7;
	int result=search(arr,number);
	if(result==-1)
	{System.out.print("Element doesn't exist in array");}
	else
	{System.out.print("Element Present at index : "+result);}
	}

public static int search(int[] arr,int num)
	{	int l=0; //left, start
		int r=arr.length-1;//right , end
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			
			//if element present at mid
			if(arr[mid]==num)
				return mid;
			if(arr[mid]<num)  //for element greater than mid, ignore left
			l=mid+1;
			else	     //for element smaller than mid, ignore right
			r=mid-1;
		}
		return -1; //element not present
		
	}
}
