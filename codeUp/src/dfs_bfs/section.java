package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class section {
	
	public static int[][] map = new int[100][100];
	public static boolean[][] visit_cnt = new boolean[100][100];
	public static boolean[][] visit_num = new boolean[100][100];
	public static int row,col,n;
	
	
	
public static boolean dfs_cnt(int i, int j) {

	if( i < 0 || i >= row || j < 0 || j >=col) {
		return false;
	}
	
	if(map[i][j] == 0 && visit_cnt[i][j] == false) {
		visit_cnt[i][j] = true;
		dfs_cnt(i-1,j);
		dfs_cnt(i,j-1);
		dfs_cnt(i+1,j);
		dfs_cnt(i,j+1);
		return true;
		
	}

		return false;
	}
	

public static int dfs_num(int i, int j) {
	
	if( i < 0 || i >= row || j < 0 || j >=col) {
		return 0;
	}
	
	int num = 1;
	
	
	if(map[i][j] == 0 && visit_num[i][j] == false) {
		visit_num[i][j] = true;
		num+=dfs_num(i-1,j);
		num+=dfs_num(i,j-1);
		num+=dfs_num(i+1,j);
		num+=dfs_num(i,j+1);
		return num;
	}
	return 0;
	}
	

public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	 row = Integer.parseInt(st.nextToken());
	 col = Integer.parseInt(st.nextToken());
	 n = Integer.parseInt(st.nextToken());
	
	
	
	int x1,x2,y1,y2;
	
	
	for (int i = 0; i < n; i++) {
		st = new StringTokenizer(br.readLine());
		
		x1 = Integer.parseInt(st.nextToken());
		y1 = Integer.parseInt(st.nextToken());
		x2 = Integer.parseInt(st.nextToken());
		y2 = Integer.parseInt(st.nextToken());
		
		for (int j = row-y2; j <= row-y1-1; j++) {
			for (int k = x1; k <= x2-1; k++) {
				map[j][k] = 1;
			}
			
		}		
	}
	
	int result = 0;
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col ; j++) {
			if(dfs_cnt(i,j)) result++;
			
		}
		
	}

	int[] sum_arr = new int[result];
	
	int cnt = 0;
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col ; j++) {
			int ans = dfs_num(i,j);
			if(ans != 0) {
			sum_arr[cnt] = ans;
			cnt++;
			}
		}
			
		}
	Arrays.sort(sum_arr);
	System.out.println(result);
	for (int i = 0; i < sum_arr.length; i++) {
		System.out.print(sum_arr[i]+" ");
	}
	
		
	}

}