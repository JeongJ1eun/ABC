
public class IfTest03 {

	public static void main(String[] args) {
		int age = 11;
		
		if(age > 19) {		
			System.out.println("성인입니다.");		// 조건문이 true면 실행
		} // 원래는 바로 옆에 else 씀
		else if(age > 12) {
			System.out.println("청소년입니다.");
		}
		else {
			if(age >= 10) {		// else + if  else if의 초석
				System.out.println("초등학생입니다.");
			}
			else {
			System.out.println("어린이입니다.");	
			}
		// else 문에 중괄호를 쓰지 않고 여러 문장을 사용하면 error
		}
		// if, else if, else 문 안에 if 문 다시 사용 가능
	}

}
