package day07_Task;

import java.util.Scanner;

public class MethodTask_01_2 {
public static void main(String[] args) {
	int n = 0;
	Scanner sc = new Scanner(System.in);
	String msg = "영어문자를 입력하시오 : ", str = "", str2="";
	System.out.println(msg);
	str = sc.nextLine(); // 영어 문자 입력받기
	
	for (int i = 0; i < str.length(); i++) {
		n=(int)str.charAt(i);
		if ((n < 91) && (n > 64)) {
			str2 += (char)(n+ 32);
		} 
		else if ((n < 123) && (n > 96)) {
			str2 += (char)(n- 32);
		}
		else {
			str2 +=(char)n;
		}
	}
	System.out.println("반환된 영어 : " +str2);
	System.out.println(str2);
}
}
