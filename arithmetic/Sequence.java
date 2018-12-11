package arithmetic;
/**
 * 연속하는 두 항의 차이가 모두 일정한 수열
 *  공통적으로 나타나는 차이므로, 공차(common difference)
 *
 */
public class Sequence {
	public static void main(String[] args) {
	//2+8+14+20+26=70
		String res ="";
		int sum =0;
		int d =6;
		for(int i =2;i<d;i++) {
			if(2+d!=0) {
				res += i+"+"+6;
			}else {
				res += i+6+"=";
			}
			sum += i;
			System.out.println(sum);
		}
		System.out.println(res+sum);
	}
}
