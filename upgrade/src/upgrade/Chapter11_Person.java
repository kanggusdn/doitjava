package upgrade;

public class Chapter11_Person {
	private String name;
	private int age;

	public Chapter11_Person() {
	}

	public Chapter11_Person(String name) {
		this.name = name;
	}

	public Chapter11_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
