package math;

import java.util.Scanner;

/*
 합성수를 소수의 곱으로 나타내는 방법
 20=2×2×5
 **/
public class Factorization {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소인수분해할 수를 입력하세요");
		int target =  scanner.nextInt();
		int count = 0;
		int[] res = new int[count]; // 동적으로 생성함 /다이나믹 : 동적   /스태틱 : 정적
		int num = 2;
		if(target<=2) {
			return;
		}	
		while(true) {
			for(int i = 2;i< target;i++) {
				if(target%i==0) {
					count = i;
					System.out.println(count);
			}
		 
		}
		
		}	
		
	}
}
