package upgrade;

public class Chapter13_TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
//		Chapter13_StringConcatImpl concat1 = new Chapter13_StringConcatImpl();
//		concat1.makeString(s1, s2);
		Chapter13_StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
	}
}