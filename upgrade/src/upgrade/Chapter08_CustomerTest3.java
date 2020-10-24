package upgrade;

public class Chapter08_CustomerTest3 {
	public static void main(String[] args) {
		Chapter08_Customer customerLee = new Chapter08_Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;

		System.out.println(customerLee.showCustomerInfo());

		Chapter08_VIPCustomer customerKim = new Chapter08_VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 1000;

		System.out.println(customerKim.showCustomerInfo());
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");

		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);

		System.out.println(customerLee.getCustomerName() + " 님이 " + leePrice + "원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() + " 님이 " + kimPrice + "원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
	}
}
