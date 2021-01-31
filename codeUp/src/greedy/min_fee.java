package greedy;

import java.util.Scanner;

	public class min_fee {

		public static void main(String[] args) {
				
				int drk;
				int pasta;
				
				Scanner sc = new Scanner(System.in);
				pasta = sc.nextInt();
				
			
				for (int i = 0; i < 2; i++) {
					int pas = sc.nextInt();
					if(pasta >= pas) {
						pasta = pas;
					}
				}
				int drk1 = sc.nextInt();
				int drk2 = sc.nextInt();
				
				if(drk1 < drk2) drk = drk1;
				else drk = drk2;
				
			
				double price = (int)((pasta + drk) * 1.1 * 10);
				double pr = price/10;
				System.out.println(pr);

		}
		}	
