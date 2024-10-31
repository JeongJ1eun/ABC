import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// 점수를 입력 받아 분기 처리
		Scanner sc = new Scanner(System.in);
		// import 방법: 커서 정위치에 두고 ctrl+shift+m, 아무 곳에 두고 ctrl+shift+o, scanner 치고 ctrl+space
		System.out.print("점수: ");
		int score = sc.nextInt();	// 정수 입력 받아 반환
		
		if(score >= 70) {
			System.out.println("여행 간다");
		}
			
		System.out.println("프로그램 종료");
	}

}
