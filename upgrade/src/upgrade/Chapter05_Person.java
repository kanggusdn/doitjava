package upgrade;

public class Chapter05_Person {
	String name;
	float height;
	float weight;
	char gender;
	boolean married;
	
	public Chapter05_Person() {}
	
	public Chapter05_Person(String pname) {
		name = pname;
	}
	public Chapter05_Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
