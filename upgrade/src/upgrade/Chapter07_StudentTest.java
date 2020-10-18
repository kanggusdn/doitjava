package upgrade;

public class Chapter07_StudentTest {
	public static void main(String[] args) {
		Chapter07_Student studentLee = new Chapter07_Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);

		Chapter07_Student studentKim = new Chapter07_Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);

		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
	}
}