package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class candy_pang {
	public static int[][] map = new int[9][9];
	public static boolean[][] visit = new boolean[9][9];
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,1,-1};
	public static int sum;
	
	
	public static int search(int x, int y) {
				
		visit[x][y] = true;
		sum=1;
		
		for (int i = 0; i < 4; i++) {
			
			int nx = x+dx[i];
			int ny = y+dy[i];

			if(map[x][y] == map[nx][ny] && visit[nx][ny] == false) {
				sum += search(nx,ny);
			}
				
			
		}
			return sum;
	}
		
public static void main(String[] args) throws IOException {
	

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer("");
	
	
	 for (int i = 1; i < 8; i++) {
		 st = new StringTokenizer(br.readLine());
		 for (int j = 1; j < 8; j++) {
			map[i][j] = Integer.parseInt(st.nextToken());
		 }

	 }
	 int answer = 0 ;
	 
	 for (int i = 1; i < 8; i++) {
		 for (int j = 1; j < 8; j++) {
			 if(search(i,j)>2) answer++;;

	}
	
	}
	 System.out.println(answer);
 }
}