
public class ContinueTest {

	public static void main(String[] args) {
		
		// 1부터 10까지 반복하다가 7을 만나면 그 다음 단계(증감식) 진행
		
//		for(int i = 1; i <= 10; i++) {	
//			// 7을 찾으면 건너뛰기
//			if(i == 7) {
//				continue;	// 다음 단계로
//			}
//			System.out.println(i);
			// System.out.println(i); 6까지 찍힘
		
		// System.out.println(i); 11이 나옴, 마지막 i++을 하고 반복문을 빠져나왔기 때문에

		// 1부터 20까지 반복하다가 13을 찾으면 건너뛰기
		for (int i = 1; i <= 20; i++) {
			// continue; 밑에 코드가 없다면 아무 의미가 없다. (건너뛸 코드가 없으므로)
			if(i == 13) {
				continue;
			}
			System.out.println(i);
		}	
	}
}

