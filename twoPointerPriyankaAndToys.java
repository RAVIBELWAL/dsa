//https://www.hackerrank.com/challenges/priyanka-and-toys/problem

import java.io.*;
import java.util.*;
public class twoPointerPriyankaAndToys {
  public static void main(String args[]) {
     
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

     for(int i=0;i<n;i++)
     arr[i]=sc.nextInt();

    Arrays.sort(arr);


    // for(int i:arr)
    // System.out.print(i+" ");

    int count=0,j=0,i=0;
    boolean check=false;

    while(i<n)
    {                                     //System.out.println("i: "+i+", "+arr[i]+" "+((arr[i])+4));
        int maxNum=arr[i]+4;
        count++;                             //      System.out.println("max: "+maxNum);
            for(j=j;j<n;j++)
            {                              //System.out.println(arr[j]+" > "+maxNum);
                if(arr[j]>maxNum)
                {
                                           //System.out.print("true\n");
                check=false;
                break;
                }
                                           // System.out.print("false\n");
            }
           if(check==false)
           {i=j;}
            
    }    
    System.out.print(count);
  }
}