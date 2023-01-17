package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//	사용자에게 키를 입력받고 정수라면 정수로 출력 실수라면 실수로 출력 
//	183->183 출력
//	183.5->183.5 출력
//	183.0->183 출력
		
		Scanner sc = new Scanner(System.in);
		String msg="숫자를 입력하시오 : ", format=null;
		double num=0.0;
		boolean isInteger = false;
		int length=0;
		
		System.out.print(msg);
		num=sc.nextDouble();
		
		length = (num - (int)num+"").length()-2;
		isInteger = num - (int)num == 0 ;
		format = isInteger ? "%.0f" : "%."+length+"f";
		
		System.out.printf(format,num);
		
		

	}
}
