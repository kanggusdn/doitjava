package upgrade;

public class Chapter09_CarTest {
	public static void main(String[] args) {
		System.out.println("=== ���� �����ϴ� �ڵ��� ===");
		Chapter09_Car myCar = new Chapter09_AICar();
		myCar.run();

		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Chapter09_Car hisCar = new Chapter09_ManualCar();
		hisCar.run();
	}
}
