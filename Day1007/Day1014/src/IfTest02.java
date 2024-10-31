
public class IfTest02 {

	public static void main(String[] args) {
		int age = 26;
		
		if(age > 19) {		
			System.out.println("성인입니다.");		// 조건문이 true면 실행
		} // 원래는 바로 옆에 else 씀
		else {
			System.out.println("미성년자입니다.");		// 조건문이 false면 실행
		// else 문에 중괄호를 쓰지 않고 여러 문장을 사용하면 error
		}
	}

}
