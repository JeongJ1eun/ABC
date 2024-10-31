import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// 3개의 정수를 입력 받아서 가장 큰 수를 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		// ctrl + alt + 방향키: 블록 지정한 문장 복사 붙여넣기
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();	
		System.out.print("세 번째 정수 입력 : ");
		int num3 = sc.nextInt();	
		
		int max = num1;
		if(num2 > max) {
			max = num2;
		}
		if(num3 > max) {
			max = num3;
		}

		System.out.println("가장 큰 수는: " + max);
		}
		
		
	}


