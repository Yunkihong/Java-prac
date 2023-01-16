package inputTest;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		String firstnum = null, secnum = null, msg = "두 정수를 입력 : ";
		// 두 정수를 입력 뒤 곱셈 결과 출력
		// 단 next()만 사용한다
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(msg);
		firstnum = sc.next();
		secnum = sc.next();
		
		
		
		result = Integer.parseInt(firstnum)*Integer.parseInt(secnum);
		
		System.out.println(firstnum+" * "+secnum+" = "+result);
		
	}
}