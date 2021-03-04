package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class section {
	
	public static int[][] map;
	public static boolean[][] visit;
	public static int[] dx = {1,0,-1,0};
	public static int[] dy = {0,1,0,-1};
	public static int row,col,n;
	
	
	
public static int dfs(int x, int y) {
	
	visit[x][y] = true;
	int num = 1;
	
	for (int i = 0; i < 4; i++) {
		
		int newX = x + dx[i];
		int newY = y + dy[i];
		
		if(newX >= 0 && newX < row && newY >=0 && newY < col) {
			if(map[newX][newY] == 0 && visit[newX][newY] == false) {
				num +=dfs(newX,newY);
			}
		}
		
	}

	return num;
	}
	

public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	 row = Integer.parseInt(st.nextToken());
	 col = Integer.parseInt(st.nextToken());
	 n = Integer.parseInt(st.nextToken());
	
	map = new int[row][col]	;
	
	int x1,x2,y1,y2;
	
	for (int i = 0; i < n; i++) {
		st = new StringTokenizer(br.readLine());
		
		x1 = Integer.parseInt(st.nextToken());
		y1 = Integer.parseInt(st.nextToken());
		x2 = Integer.parseInt(st.nextToken());
		y2 = Integer.parseInt(st.nextToken());
		
		for (int j = y1; j < y2; j++) {
			for (int k = x1; k < x2; k++) {
				map[j][k] = 1;
			}
		}
			
		}		
	
	
	visit = new boolean[row][col];

	int sum = 0;
	int cnt = 0;
	ArrayList<Integer> list = new ArrayList<>();
	
	
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			if(map[i][j] == 0 && visit[i][j] == false) {
				sum+=dfs(i,j);
				list.add(sum);
				cnt++;
				sum = 0;
				
			}
		}
	}
	
	
	System.out.println(cnt);
	Collections.sort(list);
	
	for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i)+" ");
	}
	
		
	}

}