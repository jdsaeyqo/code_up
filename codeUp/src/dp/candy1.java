package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class candy1 {
	
	static int row,col,max;
	static int[][] map;
	static boolean[][] visit;
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		map = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i < row; i++) {
			map[i][0] += map[i-1][0];
		}
		
		for (int i = 1; i < col; i++) {
			map[0][i]+=map[0][i-1];
		}
		
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				map[i][j] += Math.max(map[i-1][j], map[i][j-1]);
			}
			
		}
		
		System.out.println(map[row-1][col-1]);
		
	}

}
