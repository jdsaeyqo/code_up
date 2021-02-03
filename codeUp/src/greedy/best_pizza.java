package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class best_pizza {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int top_num = sc.nextInt();
		int dou_price=sc.nextInt();
		int top_price=sc.nextInt();
		int dou_cal=sc.nextInt();
		
		int[] top_cal = new int[top_num];

		for (int i = 0; i < top_num; i++) {
			int cal = sc.nextInt();
			top_cal[i] = cal;
		}
		Arrays.sort(top_cal);
		
		int cal_first = dou_cal/dou_price;
		int idx= top_cal.length-1;
		int cal_sum;
		int price_sum;
		cal_sum =dou_cal+top_cal[idx];
		price_sum = dou_price + top_price;
		
		while(true) {
			
			int cal_next = (cal_sum)/(price_sum);
			idx--;
			if(cal_next < cal_first) {
				break;
			}
            
            
            //기준 열량이 변경되면 그 다음 큰 열량을 합계에 더해주고 토핑가격도 가격합계에 추가해준다
			else {
				cal_sum +=top_cal[idx];
				price_sum+=top_price;
				cal_first = cal_next;
				
			}
		}
		System.out.println(cal_first);
		
		
	}
}	