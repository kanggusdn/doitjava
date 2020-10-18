package upgrade;

public class Chapter07_StudentTest {
	public static void main(String[] args) {
		Chapter07_Student studentLee = new Chapter07_Student(1001, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);

		Chapter07_Student studentKim = new Chapter07_Student(1002, "Kim");
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 100);

		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
	}
}