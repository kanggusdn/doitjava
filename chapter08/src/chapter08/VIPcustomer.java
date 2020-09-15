package chapter08;

public class VIPcustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPcustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	/*부모를 부르는 예약어 super*/
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

	@Override	/*상위 클래스 메소드 재정의: 반환형, 메소드, 매개 변수 개수, 매개 변수 자료형이 모두 같아야 함.*/
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}
	
	public int getAgentID() {
		return agentID;	/*반환 값.*/
	}
} 
