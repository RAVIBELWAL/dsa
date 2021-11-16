import java.io.*;
import java.util.*;
public class Xor {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for (int i=0; i <n; i++)
        {
            for (int j=i; j<n; j++)
            {
                for (int k=i; k<=j; k++)
                     ans^=arr[k];
            }
        }
        System.out.print(ans);
    }
}
