package learn;

public class linearSearch {

	public static void main(String[] args) {
	  int arr[]= {7,8,4,10,1};
	  int num=10;
	  int result=Search(arr,num);
	  if(result==-1) System.out.print("Element is not present in array");
	  else System.out.print("Element is present at : "+result);
	}
	
	public static int Search(int[] arr,  int num)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==num)
			{
				return i;
			}
		}
		return -1;
	}

}
