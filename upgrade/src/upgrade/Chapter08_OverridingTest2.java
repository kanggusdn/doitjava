package upgrade;

public class Chapter08_OverridingTest2 {
	public static void main(String[] args) {
		int price = 10000;

		Chapter08_Customer customerLee = new Chapter08_Customer(10010, "�̼���");
		System.out.println(customerLee.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + customerLee.calcPrice(price) + "���Դϴ�.");

		Chapter08_VIPCustomer customerKim = new Chapter08_VIPCustomer(10020, "������", 12345);
		System.out.println(customerKim.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + customerKim.calcPrice(price) + "���Դϴ�.");

		Chapter08_Customer vc = new Chapter08_VIPCustomer(10030, "������", 2000);
		System.out.println(vc.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(10000) + "���Դϴ�.");
	}
}
