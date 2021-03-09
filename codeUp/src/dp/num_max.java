package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class dd{
	static int x;
}

public class num_max {
	
	static int[] arr;
	static int[] dp;
	static int num;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		dd.x =3 ;
		num = Integer.parseInt(st.nextToken());

		arr = new int[num];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = Math.max(0, sum) + arr[i];
			max = Math.max(sum, max);
		}
			
		
		System.out.println(max);
	}
}
