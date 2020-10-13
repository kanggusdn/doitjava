package upgrade;

public class Chapter05_StudentTest1 {
	public static void main(String[] args) {
		Chapter05_Student student1 = new Chapter05_Student();
		student1.setStudentName("안연수");
		System.out.println(student1.getStudentName());
		Chapter05_Student student2 = new Chapter05_Student();
		student2.setStudentName("안승연");
		System.out.println(student2.getStudentName());
	}
}
