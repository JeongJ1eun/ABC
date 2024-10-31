import java.util.Scanner;

public class SwitchTest02 {

	public static void main(String[] args) {
		// 랭킹을 입력 받아 메달 수여
		Scanner sc = new Scanner(System.in);
		System.out.println("랭킹: ");
		int rank = sc.nextInt();
		
		// 1등: 금메달, 2등: 은메달, 3등: 동메달, 그 외: 참가상
		switch(rank) {
		case 1: System.out.println("금메달"); break;
		case 2: System.out.println("은메달"); break;
		case 3: System.out.println("동메달"); break;
		default: System.out.println("참가상"); break;
		}
	}
	
}
