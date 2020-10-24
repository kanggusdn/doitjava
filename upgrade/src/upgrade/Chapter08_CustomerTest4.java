package upgrade;

import java.util.ArrayList;

public class Chapter08_CustomerTest4 {
	public static void main(String[] args) {
		ArrayList<Chapter08_Customer> customerList = new ArrayList<Chapter08_Customer>();

		Chapter08_Customer customerLee = new Chapter08_Customer(10010, "�̼���");
		Chapter08_Customer customerShin = new Chapter08_Customer(10020, "�Ż��Ӵ�");
		Chapter08_Customer customerHong = new Chapter08_GoldCustomer(10030, "ȫ�浿");
		Chapter08_Customer customerYoul = new Chapter08_GoldCustomer(10040, "������");
		Chapter08_Customer customerKim = new Chapter08_VIPCustomer(10050, "������", 12345);

		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);

		System.out.println("===== �� ���� ��� =====");
		for (Chapter08_Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}

		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		int price = 10000;
		for (Chapter08_Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " ���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "���Դϴ�.");
		}
	}
}
