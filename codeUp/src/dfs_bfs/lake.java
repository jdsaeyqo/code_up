package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class lake {
	
	static int row,col,size;
	static int[][] map;
	static boolean[][] visit;
	static int L;
	static int[] dx = {1,0,-1,0,1,1,-1,-1};
	static int[] dy = {0,1,0,-1,1,-1,1,-1};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		L = 'L';
		
		map = new int[row][col];
		visit = new boolean[row][col];
		
		
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				 
				map[i][j] =st.nextToken().charAt(0);
			}
			
		}
		int cnt = 0;
		
		
		ArrayList<Integer> sizeList = new ArrayList<>(); 
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(map[i][j] == 'L' && visit[i][j] == false) {
					dfs(i,j);
					cnt++;
					sizeList.add(size);
					size = 0;
				}
			}
			
		}
		
		System.out.println(cnt);
		
		
		System.out.println(sizeList);
		
		
		
		
	}

	private static int dfs(int x, int y ) {
		
		size = 1;
		
		visit[x][y] = true;
		
		for (int i = 0; i < 8; i++) {
			
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if(newX >=0 && newX < row && newY >= 0 && newY < col) {
				if(map[newX][newY] == map[x][y] && visit[newX][newY] == false) {
					size+=dfs(newX,newY);
				}
			}
			
		}
		return size;
	}
}










