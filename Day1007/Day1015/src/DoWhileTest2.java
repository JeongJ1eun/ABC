
public class DoWhileTest2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int i = 1; 

		do {
			sum = sum + i;
			i++;
		} while(i <= 10);
		
		System.out.println(sum);
	}
	
}
