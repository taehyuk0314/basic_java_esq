package math;
/**
 1개반 학생의 몸무게를 측정하였다
 각 반의 학생의 수는 30명이다
 각 반의 학생 몸무게의 최대,최소 값을 구하세요
 몸무게는 40~100kg 사이에서만 랜덤으로 생성시키시오
 * */
import java.util.Random;
public class MaxMin {
	public static void main(String[] args) {
		Random random = new Random();
		int max =40, min =100;
		int[] ban = new int[30];
		
		for(int i =0;i<ban.length;i++) {
			ban[i] = random.nextInt(61)+40;
		}
		for(int i =0;i<ban.length;i++) {
			if(ban[i]>=max) {
				max = ban[i];
			}
			if(ban[i]<=min){
				min = ban[i];
			}
		}
		System.out.printf("학생 최대몸무게는%d 최소 몸무게는 %d",max,min);
	}
}
