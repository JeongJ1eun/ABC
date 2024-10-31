import java.util.Scanner;

public class Answer01 {

	public static void main(String[] args) {
		// 3개의 정수를 입력 받아서 가장 큰 수를 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자: ");
		String oper = sc.next();
		System.out.print("정수 1: ");
		int num1 = sc.nextInt();
		System.out.print("정수 2: ");
		int num2 = sc.nextInt();
		int result = 0;
		
		switch(oper) {
		case "+": 
		{
			
			break;
		}
		case "-": 
		{
			result = num1 - num2;
			break;
		}
		case "*": 
		{
			result = num1 * num2;
			break;
		}
		case "/": 
		{
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				double result2 = (double)num1 / num2;
				System.out.println("연산 결과: " + result2);
			}
			return;
		}
		default:
		{ 
			System.out.println("연산자(+, -, *, /)를 제대로 입력하세요.");
			return;
		}
		
		}
		System.out.println("연산 결과: " + result);
		
	}
}