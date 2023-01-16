package classTest;

public class Sign_in2 {
public static void main(String[] args) {
	String name = "홍윤기", firstname = "";
	for (int i = 1; i < name.length(); i++) {
		firstname += name.charAt(i);
	}
	System.out.println(firstname);
}
}
