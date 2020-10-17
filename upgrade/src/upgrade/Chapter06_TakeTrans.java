package upgrade;

public class Chapter06_TakeTrans {
	public static void main(String[] args) {
		Chapter06_Student studentJames = new Chapter06_Student("James", 5000);
		Chapter06_Student studentTomas = new Chapter06_Student("Tomas", 10000);

		Chapter06_Bus bus100 = new Chapter06_Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();

		Chapter06_Subway subwayGreen = new Chapter06_Subway("2È£¼±");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}
}
