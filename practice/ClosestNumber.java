import java.util.*;
public class Main
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(), k=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    Arrays.sort(arr);
 
    System.out.print(maxSubArr(arr, n, k));
    }
    
    public static int maxSubArr(int arr[], int n,int k)
    {   int sum = 0,ans=0;
		int r=-1,l=0;
        
        while(r<n)
        {
            while(r<l)
            {   r++;
                sum+=arr[r];
            }
            
             if(sum>k)
            { sum-=arr[l];
              l++;
            }
            
            else if(sum<k)
            {r++;
            if(r<n)
            sum+=arr[r];
            else break;}
            else break;
        }
        ans=r-l+1;    // System.out.println(r+" "+l);  
        return ans;
    }
}
