package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class big_number {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		
		
		if(s2.length() > s1.length()) {
			System.out.println(s1+" "+s2);
		}else if( s2.length() < s1.length()) {
			System.out.println(s2+" "+s1);
		}else {
			
			
			for (int i = 0; i < s1.length(); i++) {
				if(s2.charAt(i) > s1.charAt(i)) {
					System.out.println(s1+" "+s2);
					break;
				}else if(s2.charAt(i) < s1.charAt(i)) {
					System.out.println(s2+" "+s1);
					break;
				}
				
				
			}
	
		}
	
	}
}
