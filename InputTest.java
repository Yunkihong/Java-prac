package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		초기값은 아직 어떤 값을 넣을 지 모를 때 넣는 값
//		정수 : 0;
//		실수 : 0.0
//		문자 : ''
//		문자열 : null
		String name = null;
		String firstName = null, lastName =null;
		
		System.out.print("이름 : ");
		lastName = sc.next();
		firstName = sc.next();
		System.out.println(lastName + firstName + "님");

	}
}
