
import java.util.*;
import java.io.*;

public class ConcatArray {
    public static void main(String args[]) {
        //your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n*2];

    for(int i=0;i<(n*2);i++)
    {       
        if(i<n) arr[i]=sc.nextInt();
        else arr[i]=arr[i-n];
    }
    for(int i:arr)
    System.out.print(i+" ");
    }
}
