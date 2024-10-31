
public class StringTest {
		// 행 줄 서로 바꿀 때: Alt + 위아래 방향키
	public static void main(String[] args) {
		// 텍스트 블록
		/*
		 * 안녕하세요.
		 * 반갑습니다.
		 */
		String str = "안녕하세요. \n반갑습니다.";
		System.out.println(str);
		
		String str2 = """ 
					안녕하세요
					반갑습니다.
					'한글' "세종대왕"
					""";
		// 텍스트 블록: 포맷 자유로움, 따옴표 출력 가능
		System.out.println(str2);
	}

}
