package upgrade;

public class Chapter08_VIPCustomer extends Chapter08_Customer {
	private int agentID;
	double saleRatio;

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	public Chapter08_VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		// System.out.println("VIPCusomer() 생성자 호출");
	}

	public Chapter08_VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("Chapter08_VIPCustomer() 생성자 호출 ");
	}

	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}
}
