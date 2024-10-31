import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: System.out.println("1을 입력"); break;
		case 2: System.out.println("2를 입력"); break;
		default: System.out.println("1 또는 2를 입력하세요."); break;
		}
		
		/*
		if(num == 1) {
			System.out.println("1을 입력");
		}
		else if(num == 2) {
			System.out.println("2를 입력");
		}
		else {
			System.out.println("1 또는 2를 입력하세요.");
		}
		*/
	}
	
}
