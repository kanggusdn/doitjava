package upgrade;

public class Chapter08_CustomerTest2 {
	public static void main(String[] args) {
		Chapter08_VIPCustomer customerKim = new Chapter08_VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("±Ë¿ØΩ≈");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
