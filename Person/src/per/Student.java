package per;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
	
	@Override
	public String toString() {
		return name + "-" + score;
	}
	
	@Override	//comparable �������̽��� �߻� �޼ҵ�
	public int compareTo(Student o) {
		return Integer.compare(this.score, o.score);	//�Ű����� ���Ͽ� -1, 0 , 1�� ��ȯ
	}
}
