
public class Variable01 {

	public static void main(String[] args) {
		byte b1 = 1;
		byte b2 = 2;
		
		/* byte b3 = b1 + b2;	
		   JAVA는 byte 연산 불가(short도 같은 현상)
		   int로 자동변환 후 연산, 결과 int로 반환 */
		
		int b3 = b1 + b2;
		
	}

}
