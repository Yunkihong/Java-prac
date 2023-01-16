package classTest;

class Sign_in {
	String name;
	int year, month, day;
	String id;
	String pw;
	String manwomen;
	String phone;
	String firstname;
	char lastname;

	Sign_in(String name, int year, int month, int day, String id, String pw, String manwomen, String phone) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.id = id;
		this.pw = pw;
		this.manwomen = "";
		this.phone = phone;
		this.firstname = "";
		
	}
//성씨와 이름 분리	
	String firstLastname(String name) {
		lastname = name.charAt(0);
		for (int i = 1; i < name.length(); i++) {
			firstname += name.charAt(i);
		}

		return firstname;
	}
//	 첫번째 빼고 나머지 비밀번호 전부를 가리는 코드
	String hidePw(String pw) {
		String hidpw = "", bin = "*************************************************";
		char c = 0;
		for (int i = 0; i < pw.length(); i++) {
			c = pw.charAt(i + 1);
			c = bin.charAt(i);
			hidpw += c;
		}
		return hidpw;
	}
}

public class Sign_in1 {
	public static void main(String[] args) {
		Sign_in si1 = new Sign_in("홍윤기", 2000, 01, 30, "ricky0130", "알빠노", "남자", "01096648141");
		System.out.println(si1.hidePw(si1.pw));
		System.out.println(si1.firstLastname(si1.name));
		System.out.println(si1.lastname);
		System.err.println(si1.firstname);
		
	}
}