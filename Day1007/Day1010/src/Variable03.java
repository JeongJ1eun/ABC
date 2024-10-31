
public class Variable03 {

	public static void main(String[] args) {
		// 문자형
		// string은 참조형
		char c = '한';
		System.out.println(c);
		
		char d = '望';
		System.out.println(d);
		
		char e = 100;	// 음수 삽입 불가
		System.out.println(e);
		
		/* 확장열(Escape sequence)
		 \n: 개행
		 \t: Tab
		 \": 큰따옴표	
		 \': 작은따옴표		*/
		
		System.out.println("개행하기\n");
		System.out.println("\t탭키");
		System.out.println("\"안녕하세요\"");	// "안녕하세요"
		c = '\'';	// \(Escape sequence)는 문자로 취급하지 않음(2글자가 아님)
		System.out.println(c);
		System.out.println("프로그램 종료");
	
	}

}
