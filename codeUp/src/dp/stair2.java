package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stair2 {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] dp =new int[num+1];
		
		dp[0] = 1;
		dp[1] = 1;
		if(num == 1) {
			System.out.println(dp[1]);
		}else {
			dp[2] = 2;
			if(num == 2) {
				System.out.println(dp[2]);
			}else {
				
				for (int i = 3; i < dp.length; i++) {
					dp[i] = (dp[i-3]+ dp[i-2] + dp[i-1]) % 1000;
				}
				
				System.out.println(dp[num]);
			}
		}
		

	}

}
