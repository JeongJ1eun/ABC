import java.util.Scanner;

public class SwitchTest05 {

	public static void main(String[] args) {
		// 나라를 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("나라: ");
		String country = sc.next();		// 공백 기준으로 반환
		// string country = sc.nextLine();		엔터 기준으로 반환
		
		country = country.toLowerCase();
		System.out.println(country);
	
		switch(country) {		// switch case는 실수(double, float) 사용 불가, long도 너무 커서 사용 불가
		case "korea": System.out.println("서울"); break;
		case "japan": System.out.println("도쿄"); break; 
		case "china": System.out.println("베이징"); break;
		}
	}
	
}
