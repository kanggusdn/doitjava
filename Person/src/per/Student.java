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
	
	@Override	//comparable 인터페이스의 추상 메소드
	public int compareTo(Student o) {
		return Integer.compare(this.score, o.score);	//매개값을 비교하여 -1, 0 , 1을 반환
	}
}
