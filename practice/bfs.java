package graphs;

import java.util.*;

public class bfs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();//

		List<Integer>[] adjacencyList = new ArrayList[20];
		for (int i = 0; i <n; i++)
			adjacencyList[i] = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adjacencyList[u].add(v);
			adjacencyList[v].add(u);
		}

//		for (int i = 1; i <= n; i++)
//			System.out.println(adjacencyList[i]);

		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited=new boolean[n];

		q.add(0);
		System.out.println(0+" ");
		while (!q.isEmpty()) {
			int node=q.peek();
			q.poll();
			visited[node]=true;
			for(int i:adjacencyList[node])
			{
				if(!visited[i])
				{
					System.out.println(i+" ");
					q.add(i);
				}
			}
		}
	}
}
