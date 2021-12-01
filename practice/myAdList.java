package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class myAdList{
    public static int arr[]={0,1,1,2,3};
    public static int arr1[]= {1,3,2,5,4};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;//sc.nextInt();
        int m=5;//sc.nextInt();
         List<Integer>[] adjList=new ArrayList[n+1];
         for(int i=0;i<=n;i++)
             adjList[i]=new ArrayList<>();
         
         for (int i = 0; i <m; i++) { 
        int u,v;
        u=arr[i];//sc.nextInt();
        v=arr1[i];//sc.nextInt();
        adjList[u].add(v);
        adjList[v].add(u);
        
        }
         for(int i=0;i<=n;i++)
             System.out.println(i+"->"+adjList[i]);
    }
}
