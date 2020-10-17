package upgrade;

public class Chapter06_Student {
	public String studentName;
	public int grade;
	public int money;

	public Chapter06_Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Chapter06_Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}

	public void takeSubway(Chapter06_Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}

	public void showInfo() {
		System.out.println(studentName + "¥‘¿« ≥≤¿∫ µ∑¿∫ " + money + "¿‘¥œ¥Ÿ.");
	}
}
