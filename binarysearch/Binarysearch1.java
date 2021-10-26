package dsa.binarysearch;

import java.util.*;
public class Binarysearch1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int x=7;
        int ans=binarySearch(arr,0,n-1,x);
        
        if(ans==-1)System.out.print("Element didn't present in the array ");
        else System.out.print("Element is at index : "+ans);
        
    }
    
    public static int binarySearch(int[] arr,int l,int r,int num)
    {   
        if(r>=l)
        {
        int mid=(l+r)/2;
        
        if(arr[mid]==num)
         return mid;
        
        if(arr[mid]<num)
        return binarySearch(arr,mid+1,r,num);
        
        return binarySearch(arr,l,mid-1,num);
        
        }
        return -1;
    }
}

