package day07_Task;

import java.util.Scanner;

public class MethodTask_02 {
	//한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024), indexOf() 사용
	//"공일이삼사오육칠팔구"
	//"일공이사"
	//"공일이삼사오육칠팔구".indexOf("일") --> 1
	String korToNum (String input) {
		String output="",bin="공일이삼사오육칠팔구";
		for(int i=0;i<input.length();i++) {
			bin.indexOf(i);
		}
		
		
		
		
		return output;
	}
	
	
	
public static void main(String[] args) {
	MethodTask_02 mt = new MethodTask_02();
	Scanner sc = new Scanner(System.in);
	String msg = "한글 정수를 입력하시오",input = "";
	System.out.println(msg);
	input = sc.nextLine();
	


}
}
