import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		// 1을 입력했을 때 표시
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요. ");
		int n = sc.nextInt();	
		
		if(n == 1) {
			System.out.println("정수 1이 입력되었습니다.");
		}
	}

}
