package chapter13.stream;

public class Member {
	public static int MALL = 0;
	public static int FEMALL = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public String getName() { return name; }
	public int getSex() { return sex; }
	public int getAge() { return age; }
}
