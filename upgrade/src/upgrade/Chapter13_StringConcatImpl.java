package upgrade;

public class Chapter13_StringConcatImpl implements Chapter13_StringConcat {
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}
}