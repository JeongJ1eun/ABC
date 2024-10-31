import java.util.Scanner;

public class IfTest05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("점수 제대로 입력");
			return;
		}
		
		if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
	
}
