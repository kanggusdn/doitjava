package chapter08;

public class VIPcustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPcustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	/*�θ� �θ��� ����� super*/
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	public VIPcustomer() {
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	@Override	/*���� Ŭ���� �޼ҵ� ������: ��ȯ��, �޼ҵ�, �Ű� ���� ����, �Ű� ���� �ڷ����� ��� ���ƾ� ��.*/
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դϴ�.";
	}
	
	public int getAgentID() {
		return agentID;	/*��ȯ ��.*/
	}
} 
