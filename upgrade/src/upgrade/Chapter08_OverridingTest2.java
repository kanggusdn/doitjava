package upgrade;

public class Chapter08_OverridingTest2 {
	public static void main(String[] args) {
		int price = 10000;

		Chapter08_Customer customerLee = new Chapter08_Customer(10010, "이순신");
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다.");

		Chapter08_VIPCustomer customerKim = new Chapter08_VIPCustomer(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");

		Chapter08_Customer vc = new Chapter08_VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
	}
}
