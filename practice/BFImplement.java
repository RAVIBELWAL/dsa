package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFImplement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		List<Integer>[] adjLists =new ArrayList[n+1];

		for (int i = 0; i < n; i++)
			adjLists[i] = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			adjLists[u].add(v);
			adjLists[v].add(u);
		}
		// 1. queue
		// 2. visited
		Queue<Integer> q = new LinkedList<>();
		boolean visited[] = new boolean[n + 1];

		q.add(0);
		System.out.print(0 + " ");
		while (!q.isEmpty()) {
			int node=q.peek();
			q.poll();
			visited[node]=true;
			
			for(int i:adjLists[node])
			{
				if(!visited[i])
				{
					System.out.print(i+" ");
					q.add(i);
				}
			}
		}

		sc.close();
	}
}
