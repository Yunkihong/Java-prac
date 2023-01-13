package classTest;

class Sign_in {
	String name;
	int year, month, day;
	String id;
	String pw;
	String sex;
	String phone;

	Sign_in(String name, int year, int month, int day, String id, String pw, String sex, String phone) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.id = id;
		this.pw = pw;
		this.sex = sex;
		this.phone = phone;
	}

	
	
	// 비밀번호를 가리는 코드
	String hidePw(String pw) {
		String hidpw = "",bin="*************************************************";
		char c = 0;
		for (int i = 0; i < pw.length(); i++) {
			c = pw.charAt(i+1);
			c=bin.charAt(i);
			hidpw+= c;
		}
		return hidpw;
	}
}

public class Sign_in1 {
	public static void main(String[] args) {
		
		Sign_in si1 = new Sign_in("홍윤기eeee", 2000, 01, 30, "ricky0130", "알빠노", "남자", "01096648141");
		
		System.out.println(si1.hidePw(si1.pw));

	}

}
