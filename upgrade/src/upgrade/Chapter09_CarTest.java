package upgrade;

public class Chapter09_CarTest {
	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		Chapter09_Car myCar = new Chapter09_AICar();
		myCar.run();

		System.out.println("=== 사람이 운전하는 자동차 ===");
		Chapter09_Car hisCar = new Chapter09_ManualCar();
		hisCar.run();
	}
}
