package upgrade;

public class Chapter06_StudentTest {
	public static void main(String[] args) {
		System.out.println(Chapter06_Student2.getSerialNum());

		Chapter06_Student2 studentLee = new Chapter06_Student2();
		studentLee.setStudentName("이지원");
		System.out.println(Chapter06_Student2.getSerialNum());
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);

		Chapter06_Student2 studentSon = new Chapter06_Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Chapter06_Student2.getSerialNum());
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
	}
}
