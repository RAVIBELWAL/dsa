/*

9 9
1 2
1 7
1 3
7 8
8 9
6 7
4 6
4 5   
3 4

*/

import java.util.*;

public class adjacencyMatrix
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,m;
    n=sc.nextInt();
    m=sc.nextInt();
    
    List<Integer>[] adjacencyList=new ArrayList[20];
    for(int i=1;i<=n;i++)
    adjacencyList[i]=new ArrayList<>();
    
    for(int i=0;i<m;i++)
    {
        int u,v;
        u=sc.nextInt();
        v=sc.nextInt();
        adjacencyList[u].add(v);
        adjacencyList[v].add(u);
    }
    
    for(int i=1;i<=n;i++)
    System.out.println(adjacencyList[i]);

	}
}
