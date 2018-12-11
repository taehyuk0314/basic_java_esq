package arithmetic;
/**
 * 연속하는 두 항의 차이가 모두 일정한 수열
 *  공통적으로 나타나는 차이므로, 공차(common difference)
 *
 */
public class Sequence5 {
	public static void main(String[] args) {
	//2+8+14+20+26=70
		int A = 2; // 초항 2
        int S = A;
        int D = 6; // 공차
        int N = 2; // 번째
        int AN = 0;
        // 2 + 8 + 14 + 20
        // 2 + (2+6) + (2+6+6)+ (2+6+6+6)
        String ex = "2";
        while (true) {
        	A += D;
        	S+= A;
        	AN++;
        	ex +="+"+A;
        	if(AN<4) {
        		continue;
        	}else {
        		break;
        	}
        
        }
         System.out.println(ex + "=" + S); // syso
	}
}
