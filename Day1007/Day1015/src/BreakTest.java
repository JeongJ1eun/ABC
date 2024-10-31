
public class BreakTest {

	public static void main(String[] args) {
		
		// 1부터 10까지 반복하다가 7을 만나면 반복문을 종료 
//		
//		for(int i = 1; i <= 10; i++) {	
//			System.out.println(i);
//			if(i == 7) {
//				break;
//			}
//			// System.out.println(i); 6까지 찍힘
//		}
		// System.out.println(i); 11이 나옴, 마지막 i++을 하고 반복문을 빠져나왔기 때문에

		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
			if(i == 13) {
				break;
			}
		}
	}
}
