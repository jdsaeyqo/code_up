package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class height {
	static int[][] map;
	static boolean[] visit;
	static int t,s,num;

	
	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
				
		num = Integer.parseInt(st.nextToken());
		map = new int[num+1][num+1];
		
		st= new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b =Integer.parseInt(st.nextToken());
			map[a][b] = 1;
			
		}
		
		int ans = 0;
		
		for (int i = 1; i < num+1; i++) {
			t = 0;
			s = 0;
			
			dfsT(i);
			dfsS(i);
			
			if(t+s == num-1) ans++;
			
		}
		System.out.println(ans);

	}

	private static void dfsS(int i) {
		
		visit = new boolean[num+1];
		visit[i] = true;
		Queue<Integer> q = new LinkedList<>();
		q.offer(i);
		
		while(!q.isEmpty()) {
			
		int x = q.poll();
		
		for (int j = 1; j <num+1; j++) {
			if(map[j][x] == 1 && visit[j] == false) {
				q.offer(j);
				visit[j] = true;
				s++;
			}
		}
	}
	}

	private static void dfsT(int i) {
		visit = new boolean[num+1];
		visit[i] = true;
		Queue<Integer> q = new LinkedList<>();
		q.offer(i);
		
		while(!q.isEmpty()) {
			
		int x = q.poll();
		
		for (int j = 1; j < num+1; j++) {
			if(map[x][j] == 1 && visit[j] == false) {
				q.offer(j);
				visit[j] = true;
				t++;
			}
		}
	}
	}
		
}

