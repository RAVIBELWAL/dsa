package dsa;
public class linearSearchImp {

	public static void main(String[] args) {
		  int arr[]= {7,8,4,10,1};
		  int num=10;
		  int result=Search(arr,num);
		  if(result==-1) System.out.print("Element is not present in array");
		  else System.out.print("Element is present at : "+result);
		}
		
		public static int Search(int[] arr,  int num)
		{
			int n=arr.length,l=0,r=n-1,index=-1;
			
			for(int i=0;i<n;i++)
			{
				
				if(arr[l]==num)
				return l+1;
				
				if(arr[r]==num)
				return r+1;
				
				else
					l++;
					r--;
			}
			return -1;
		}
}
