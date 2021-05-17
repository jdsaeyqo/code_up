package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeUp1024 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println("'"+str.charAt(i)+"'");
			
		}
		
		
		
	}
}
