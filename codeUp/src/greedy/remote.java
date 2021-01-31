package greedy;

import java.util.Scanner;

public class remote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		int num = num2 - num1;
		
		if (num < 0) num= -num;
		
		if (num > 10) {
			cnt = num/10;
			num = num-10*cnt;
		}
		if( num > 7) {
			cnt+=11-num;

		}else if(num>4) {
			cnt+=num-4;
		}else if(num == 4){
			cnt+=2;
		}
		else {
			cnt+=num;
		}
			System.out.println(cnt);
	}
}
