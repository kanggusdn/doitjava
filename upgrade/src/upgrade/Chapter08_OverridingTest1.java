package upgrade;

public class Chapter08_OverridingTest1 {
	public static void main(String[] args) {
		Chapter08_Customer customerLee = new Chapter08_Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;

		Chapter08_VIPCustomer customerKim = new Chapter08_VIPCustomer(10020, "������", 12345);
		customerKim.bonusPoint = 10000;

		int price = 10000;
		System.out.println(customerLee.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customerLee.calcPrice(price) + "���Դϴ�.");
		System.out.println(customerKim.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customerKim.calcPrice(price) + "���Դϴ�.");
	}
}
