package day07_Task;

import java.util.Scanner;

public class MethodTask_01 {

	// 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String text( String input) {
		int n = 0;
		String output="";
		for (int i = 0; i < input.length(); i++) {
			n = (int) input.charAt(i);
			if ((n <= 90) && (n >= 65)) {
				output += (char) (n + 32);
			} else if ((n <= 122) && (n >= 97)) {
				output += (char) (n - 32);
			} else {
				output += (char) n;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		MethodTask_01 mt = new MethodTask_01();
		Scanner sc = new Scanner(System.in);
		String msg = "영어문자를 입력하시오 : ", input = "", output = "";
		System.out.println(msg);
		input = sc.nextLine(); // 영어 문자 입력받기
		System.out.println("반환된 영어 : " + mt.text(input));
	}

}
