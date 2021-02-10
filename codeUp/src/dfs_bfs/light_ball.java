package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class light_ball {
	
public static int x, y;
	
public static int[][] map_on = new int[100][100];
public static int[][] map_off = new int[100][100];


public static boolean dfs_on(int a, int b) {
	
	if(a < 0 || a >= x  || b <0 || b >= y) {
		return false;
	}
	
	if(map_on[a][b] ==0) {
	map_on[a][b] = 1;
	
	dfs_on(a-1,b);
	dfs_on(a,b-1);
	dfs_on(a+1,b);
	dfs_on(a,b+1);
		
	return true;
	}

	return false;
	
}
public static boolean dfs_off(int a, int b) {
	
	if(a < 0 || a >= x  || b <0 || b >= y) {
		return false;
	}
	
	if(map_off[a][b] ==1) {
		map_off[a][b] = 0;
		
		dfs_off(a-1,b);
		dfs_off(a,b-1);
		dfs_off(a+1,b);
		dfs_off(a,b+1);
		
		
		return true;
	}
	
	
	
	
	return false;
	
}
	
	
public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer("");
	
	st= new StringTokenizer(br.readLine());
	
	x = Integer.parseInt(st.nextToken());
	y = Integer.parseInt(st.nextToken());
	
	
	for (int i = 0; i < x; i++) {
		st= new StringTokenizer(br.readLine());
		for (int j = 0; j < y; j++) {
			map_on[i][j] = Integer.parseInt(st.nextToken());
			
		}
	}

	for (int i = 0; i < map_on.length; i++) {
		for (int j = 0; j < map_on[0].length; j++) {
			map_off[i][j] = map_on[i][j];
		}
	}

	int result_on =0;
	for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
			if(dfs_on(i,j)) result_on++; 
				
		}
		
	}
	
	int result_off =0;
	for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
			if(dfs_off(i,j)) result_off++; 
				
		}
		
	}

	System.out.println(result_on+" "+result_off);
	
	 
 }
}