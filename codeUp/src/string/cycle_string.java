package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cycle_string {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = new String[3];
		boolean check = true;
		
		
		for (int i = 0; i < 3; i++) {
			arr[i] = br.readLine();
		}
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i].charAt(0) != arr[i-1].charAt(arr[i-1].length()-1)) {
				check = false;
			}
			
			if(i == 2) {
				if(arr[i].charAt(arr[i].length()-1) != arr[0].charAt(0)) {
					check = false;
				}
			}
			
			
			
		}
		
		if(check) {
			System.out.println("good");
		}else {
			System.out.println("bad");
		}
		
		
		
	}
}
