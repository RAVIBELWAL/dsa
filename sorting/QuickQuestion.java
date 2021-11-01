package learn;
import java.io.*;
import java.util.*;
public class  QuickQuestion {
    public static void main(String args[]) {
        // your code here
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int pivot=arr[0];

        int res_arr[]=new int[n];
        int res_index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<pivot)
            {
                res_arr[res_index++]=arr[i];
            }
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]==pivot)
            {
                res_arr[res_index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>pivot)
            {
                res_arr[res_index++]=arr[i];
            }
        }
        for(int i: res_arr)
        {System.out.print(i+" ");}
 
        
    }

}