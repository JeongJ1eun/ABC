import java.util.Scanner;

public class IfTest06 {

	public static void main(String[] args) {
		// 3개의 정수를 입력 받아서 가장 큰 수를 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int a = sc.nextInt();
		// ctrl + alt + 방향키: 블록 지정한 문장 복사 붙여넣기
		System.out.print("두 번째 정수 입력 : ");
		int b = sc.nextInt();	
		System.out.print("세 번째 정수 입력 : ");
		int c = sc.nextInt();	
		int max1 = 0;
		int max2 = 0;
		max1 = a > b ? a : b;
		max2 = c > max2 ? c : max2;

		
		if(max1 > max2) {
			if(a > c) System.out.println("a, b, c 중 가장 큰 수는 a입니다.");
			else if(c > a) System.out.println("a, b, c 중 가장 큰 수는 c입니다.");
		}
		else if(b > a) {
			if(b > c) System.out.println("a, b, c 중 가장 큰 수는 b입니다.");
			else if(c > b) System.out.println("a, b, c 중 가장 큰 수는 c입니다.");
		}
		
		
	}

}
