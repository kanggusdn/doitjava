package upgrade;

public class Chapter11_NewInstanceTest {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Chapter11_Person person1 = new Chapter11_Person();
		System.out.println(person1);

		Class pClass = Class.forName("upgrade.Chapter11_Person");
		Chapter11_Person person2 = (Chapter11_Person) pClass.newInstance();
		System.out.println(person2);
	}
}
