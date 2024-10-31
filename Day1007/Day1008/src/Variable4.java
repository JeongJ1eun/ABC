
public class Variable4 {

	public static void main(String[] args) {
		// 기본형 정수형
		byte b = -128;
		// byte b = -129; error		1byte
		System.out.println(b);
		
		short s = 32767;
		// short s = 32768; error		2byte
		System.out.println(s);
		
		int i = 2100000000;
		// int i = 21000000000; error		4byte
		System.out.println(i);
		
		long l = 21000000000L; 
		// long l = 210000000000; error, 뒤에 L 또는 l 삽입		8byte
		System.out.println(l);
	}

}
