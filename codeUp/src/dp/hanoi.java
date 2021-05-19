package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hanoi {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		
		dp[1] = 2;
		if(n == 1) {
			System.out.println(move(1));
			System.out.println(2);
		}else {
			for (int i = 2; i < dp.length; i++) {
				dp[i] = 3*dp[i-1] + 2;
			}
			
			System.out.println(move(n));
			System.out.println(dp[n]);
		}
		
		
	}

	private static String move(int i) {
		if ( i == 1) {
			String s = "1 : A->B\n1 : B->C";
			return s;					
		}
		
		
		String val = String.valueOf(i);
		
		String s = move(i-1)+"\n"+val+" : A->B\n"+move_back(i-1)+"\n"+val+" : B->C\n" + move(i-1);
		return s;
	}

	private static String move_back(int i) {
		if ( i == 1) {
			String s = "1 : C->B\n1 : B->A";
			return s;					
		}
		String val = String.valueOf(i);
		
		String s = move_back(i-1)+"\n"+val+" : C->B\n"+move(i-1)+"\n"+val+" : B->A\n" + move_back(i-1);
		return s;
	}
}
