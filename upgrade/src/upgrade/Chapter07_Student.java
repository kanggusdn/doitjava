package upgrade;

import java.util.ArrayList;

public class Chapter07_Student {
	int studentID;
	String studentName;
	ArrayList<Chapter07_Subject> subjectList;

	public Chapter07_Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Chapter07_Subject>();
	}

	public void addSubject(String name, int score) {
		Chapter07_Subject subject = new Chapter07_Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}

	public void showStudentInfo() {
		int total = 0;
		for (Chapter07_Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("�л� " + studentName + "�� " + s.getName() + " ���� ������ " + s.getScorePoint() + "�Դϴ�.");
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + "�Դϴ�.");
	}
}