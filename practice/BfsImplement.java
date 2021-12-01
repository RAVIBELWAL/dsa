package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
        
  ///bfs
	    Queue<Integer> q=new LinkedList<>();
	    boolean visited[]=new boolean[n+1]; // n+1 visited nodes array (n+1, as 0 base indexing)
	    
	    q.add(0); //start node depends of graph and can be anything from graph
	    System.out.print("\n"+0+" ");
	    
	    while(!q.isEmpty())
	    {
	    int node =q.peek(); // taking peek of queue in node
	    q.poll(); //removing peek of queue
	    visited[node]=true;
	    for(int i:adjList[node]) //i will give value as adjList[node][i]
	    	{
		    	if(!visited[i])
		    	{
		    		System.out.print(i+" ");
		    		q.add(i);
		    	}
	    	}
	    }
    }
}
