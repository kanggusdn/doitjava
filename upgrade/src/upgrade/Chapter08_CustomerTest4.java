package upgrade;

import java.util.ArrayList;

public class Chapter08_CustomerTest4 {
	public static void main(String[] args) {
		ArrayList<Chapter08_Customer> customerList = new ArrayList<Chapter08_Customer>();

		Chapter08_Customer customerLee = new Chapter08_Customer(10010, "이순신");
		Chapter08_Customer customerShin = new Chapter08_Customer(10020, "신사임당");
		Chapter08_Customer customerHong = new Chapter08_GoldCustomer(10030, "홍길동");
		Chapter08_Customer customerYoul = new Chapter08_GoldCustomer(10040, "이율곡");
		Chapter08_Customer customerKim = new Chapter08_VIPCustomer(10050, "김유신", 12345);

		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);

		System.out.println("===== 고객 정보 출력 =====");
		for (Chapter08_Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}

		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		for (Chapter08_Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
	}
}
