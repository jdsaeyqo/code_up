package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pascal {
	
	static long[][] arr;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		arr =new long[N][N];
		
		arr[0][0] = 1;
		if(N == 1) {
			System.out.println(arr[0][0]);
		}else{
			arr[1][0] = 1;
			arr[1][1] = 1;
			
			if(N==2) {
				print(N);
			}else {
				
				for (int i = 2; i < N; i++) {
					
					for (int j = 0; j < N; j++) {
						
						if(j == 0) {
							arr[i][j] = 1;
						}else if( j == i) {
							arr[i][j] = 1;
						}else{
							arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
						}
					}
				}
				
				
				print(N);
			}
		}
		
		
		
		
		
		
	}

	private static void print(int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(arr[i][j] != 0) {
					System.out.print(arr[i][j]+" ");
				}
				
			}
			System.out.println();
			
		}
		
		
	}
}
