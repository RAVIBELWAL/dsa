import java.util.Scanner;

public class FIRST_ELEMENT_TO_OCCUR_K_TIMES {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//number of elements
		int k=sc.nextInt();//occurrence
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int frq[]=new int[100001];
		int index=-1; //if no element present then -1 is index
		boolean check=false; //check ans found is false by default
		
		
		for (int i = 0; i <n; i++) {
			frq[arr[i]]++;   //increment the freq at position arr[i]
			if(frq[arr[i]]>=k) //check if updated freq is >= req. freq
			{
				check=true;    //if found check = true
				index=arr[i];   // found element is arr[i] for which freq is updated
				break;      //no need to go forward so break
			}
		}

		System.out.println((check?index:"-1"));  //if check true i.e, ans found print ans else print -1
	}
}
