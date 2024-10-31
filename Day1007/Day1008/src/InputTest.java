import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ctrl + shift + m : 현재 위치 import
		// ctrl + shift + o : 커서 위치 상관 없이 import(복수 지정 가능)
		System.out.print("이름을 입력하세요: ");
		String name = scan.next();
		// String : 문자열 타입 관리
		// next() : 값을 입력 받음
		System.out.println("입력한 이름: " + name);
		System.out.print("나이: ");
		int age = scan.nextInt();
		System.out.println("입력한 나이: " + age);
		
		// 확인하고자 하는 중괄호를 블록 지정하면 해당 괄호와 상응하는 중괄호를 표시
		// terminate 불 꺼지면 프로그램 종료
		// 명칭도 대소문자 구분
		// 블록 지정 후 ctrl + / : 주석 처리
		// ctrl + space : 자동 완성
	}

}
