package upgrade;

public class Chapter06_StudentTest {
	public static void main(String[] args) {
		System.out.println(Chapter06_Student2.getSerialNum());

		Chapter06_Student2 studentLee = new Chapter06_Student2();
		studentLee.setStudentName("������");
		System.out.println(Chapter06_Student2.getSerialNum());
		System.out.println(studentLee.studentName + " �й�:" + studentLee.studentID);

		Chapter06_Student2 studentSon = new Chapter06_Student2();
		studentSon.setStudentName("�ռ���");
		System.out.println(Chapter06_Student2.getSerialNum());
		System.out.println(studentSon.studentName + " �й�:" + studentSon.studentID);
	}
}
