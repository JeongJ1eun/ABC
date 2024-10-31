
public class LoopTest {

	public static void main(String[] args) {
		// 1 ~ 10까지 더한 결과
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("합계: " + sum);
		
		// for (int i = 1; i <= 10; i++) {
		// sum = sum + i;
		// }
		
		int num = 0;
		
		for (int i = 25; i <= 77; i++) {
			num = num + i;
		}
		System.out.println("합계: " + num);
	}
}
