import java.util.Scanner;

public class Practice01 {

		public static void main(String[] args) {
			// 양의 정수를 입력 받아 홀수인지 짝수인지 출력
			Scanner sc = new Scanner(System.in);
			System.out.print("양의 정수를 입력하세요 : ");
			int num1 = sc.nextInt();
			
			if(num1 % 2 == 0) {
				System.out.println("짝수입니다");
			}
			else {
				System.out.println("홀수입니다");
			}
		}
}
