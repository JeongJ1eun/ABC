import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수: ");
		int num = sc.nextInt();
		
		//홀짝 판단
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수다.");
		}
		else {
			System.out.println(num + "은 홀수다.");
		}

	}

}
