import java.util.Scanner;

public class IfTest05 {

	public static void main(String[] args) {
		// 1을 입력해도, 그 외의 정수를 입력해도 메시지 표시
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요. ");
		int n = sc.nextInt();	
		
		if(n == 1) {
			System.out.println("정수 1이 입력되었습니다.");
		}
		else if(n == 2) {
			System.out.println("정수 2가 입력되었습니다.");
		}
		else if(n == 3) {
			System.out.println("정수 3이 입력되었습니다.");
		}
		else {
			System.out.println("1, 2, 3 외의 정수가 입력되었습니다.");
		}
		
	}

}
