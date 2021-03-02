package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class remember7 {
	
	static int[] num;
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		num = new int[n+1];
		dp = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < n+1; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			
		}
		for (int i = 1; i < n+1; i++) {
			dp[i] = num[i]+dp[i-1];
			
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int finish = Integer.parseInt(st.nextToken());
			
			System.out.println(dp[finish] - dp[start-1]);
			
			
		}
		
	}

	
}
