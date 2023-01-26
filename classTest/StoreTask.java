package classTest;

class Store{
	String product;
	int price;
	int stock;
	Store(String product, int price, int stock) {
		this.product = product;
		this.price = price;
		this.stock = stock;
	}
	int sell(int stock) {
		return --stock;
	}
}
class Costumer{
	String name;
	String phoneNumber;
	int account;
	int sale;
	Costumer(String name, String phoneNumber, int account, int sale) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.account = account;
		this.sale = sale;
	}
	
}


public class StoreTask {

	public static void main(String[] args) {
		Store s1=new Store("델리만쥬",3_000,3);
		Costumer c1=new Costumer("홍윤기","010-9664-8141",10_000,10);
		Costumer c2=new Costumer("홍길동","000-0000-1234",100_000_000,99);
		s1.price=s1.price-s1.price/c1.sale;
		System.out.println(s1.price);
		
		
		
	}

}
