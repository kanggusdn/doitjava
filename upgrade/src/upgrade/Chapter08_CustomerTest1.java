package upgrade;

public class Chapter08_CustomerTest1 extends Chapter08_Customer {
	public static void main(String[] args) {
		Chapter08_Customer customerLee = new Chapter08_Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

		Chapter08_VIPCustomer customerKim = new Chapter08_VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
