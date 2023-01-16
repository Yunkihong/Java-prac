package inputTest;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 출력
//		nextInt() : 입력받은 정수
//		입력 클래스 선언
		Scanner sc = new Scanner(System.in);
//		출력할 메세지 변수에 담기
		String msg1 = "정수 3개를 입력하시오 : ", format = "%d + %d + %d = %d";
//		3개의 정수를 담을 변수 3개,결과 넣을 변수 선언
		int number1 = 0, number2 = 0, number3 = 0, result = 0;
//		
		System.out.print(msg1);
//		입력받은 정수 3개 각 변수에 대입
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
//		각 변수에 담은 결과를 변수에 대입
		result = number1 + number2 + number3;
//		결과값 출력
		System.out.printf(format, number1, number2, number3, result);
	}
}
