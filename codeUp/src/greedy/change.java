package greedy;

import java.util.Scanner;

public class change {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int money = sc.nextInt();
		
		while(true) {
		if ( money >= 50000 ) {
			money -= 50000;
			cnt++;
		}else if ( money >= 10000 ) {
			money -= 10000;
			cnt++;
		}
		else if ( money >= 5000) {
			money -= 5000;
			cnt++;
		}else if (money >= 1000) {
			money-=1000;
			cnt++;
		}else if (money >= 500) {
			money-=500;
			cnt++;
		}else if (money >=100) {
			money-=100;
			cnt++;
		}else if (money >= 50) {
			money-=50;
			cnt++;
		}else if (money >= 10) {
			money-=10;
			cnt++;
		}else break;
	}
		System.out.println(cnt);
	}
}	