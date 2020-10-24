package upgrade;

public class Chapter08_GoldCustomer extends Chapter08_Customer {
	double saleRatio;

	public Chapter08_GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}
}
