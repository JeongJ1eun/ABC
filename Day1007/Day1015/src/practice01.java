import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		// 3개의 정수를 입력 받아서 가장 큰 수를 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 입력 : ");
		String y = sc.next();
		
		switch(y) {
		case "+": 
		{
			System.out.print("정수 1 입력: ");
			int n1 = sc.nextInt();
			System.out.print("정수 2 입력: ");
			int n2 = sc.nextInt();
			System.out.println(n1 + n2);
			break;
		}
		case "-": 
		{
			System.out.print("정수 1 입력: ");
			int n1 = sc.nextInt();
			System.out.print("정수 2 입력: ");
			int n2 = sc.nextInt();
			 System.out.println(n1 - n2);
			 break;
		}
		case "*": 
		{
			System.out.print("정수 1 입력: ");
			int n1 = sc.nextInt();
			System.out.print("정수 2 입력: ");
			int n2 = sc.nextInt();
			System.out.println(n1 * n2);
			break;
		}
		case "/": 
		{
			System.out.print("정수 1 입력: ");
			int n1 = sc.nextInt();
			System.out.print("정수 2 입력: ");
			int n2 = sc.nextInt();
			if(n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else System.out.println(n1 / n2);
			break;
		}
		default: System.out.println("연산자 입력이 잘못되었습니다.");
		}
		
	}
}