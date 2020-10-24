package upgrade;

public class Chapter08_CustomerTest3 {
	public static void main(String[] args) {
		Chapter08_Customer customerLee = new Chapter08_Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;

		System.out.println(customerLee.showCustomerInfo());

		Chapter08_VIPCustomer customerKim = new Chapter08_VIPCustomer(10020, "������", 12345);
		customerKim.bonusPoint = 1000;

		System.out.println(customerKim.showCustomerInfo());
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");

		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);

		System.out.println(customerLee.getCustomerName() + " ���� " + leePrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() + " ���� " + kimPrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerKim.showCustomerInfo());
	}
}
