
/**
note : change the name of .java file to Main  

test case: 
5 4
0 1 0 2 0 3 2 4

**///

import java.util.*;

public class Main
{   
    int v;
    ArrayList<ArrayList<Integer>> adjList;
    
    Main(int n)     // this constuctor will initialising a space or adjList of adjList
    {
        v=n;
        adjList=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)     
        adjList.add(new ArrayList<Integer>());
    }
    
    public void addEdge(int u,int v)  //assign values to adjList lists
    {
        adjList.get(u).add(v);    //at arrayList position u add v list element
        adjList.get(v).add(u);    
    }
    
    void dfs(int start) //starting dfs with initial vertex
    {
        boolean isVisited[]=new boolean[v];  //maintaining isVisited array
        dfsRecursively(start,isVisited); //traversing Recursively 
    }
    
    
    void dfsRecursively(int s, boolean[] isVisited)
    {
        isVisited[s]=true; //marking source vertex s as Visited "true"
        System.out.print(s+" ");  //print vertex visited
        
        for(int curr:adjList.get(s))  //traversing all valid adjacent vertices sored in the adjList lists index
        {
            if(!isVisited[curr]) //if currAdjVertex is not visited
            {
                dfsRecursively(curr,isVisited);  //traverse the adj vertices of curr
            }
        }
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();  //no of vertices
		int m=sc.nextInt(); // no of ediges
		
		Main g =new Main(n);  // to declare adjList list
		
		for (int i=0;i<m ;i++ )
		 g.addEdge(sc.nextInt(),sc.nextInt());  // inserting ediges 
		 
		 g.dfs(0);   //starting vertex
	}
}
