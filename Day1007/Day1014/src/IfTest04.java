
public class IfTest04 {

	public static void main(String[] args) {
		int age = 25;
		boolean man = false;		// true: 남성, false: 여성
		
		if(age >= 19) {
			if(man) {		// 성인이고 남성
			System.out.println("성인 남성: 25000");
			}
			else {		// 성인이고 여성
				System.out.println("성인 여성: 21000");
			}
			
		}
		else {
			System.out.println("청소년: 15000");
		}
		
		/*
		boolean bool = true;
		if(false) {
			System.out.println("실행");
		}
		*/
	}
	
}
