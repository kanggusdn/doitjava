package upgrade;

public class Chapter11_ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Chapter11_Person person = new Chapter11_Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());

		Class pClass2 = Chapter11_Person.class;
		System.out.println(pClass2.getName());

		Class pClass3 = Class.forName("upgrade.Chapter11_Person");
		System.out.println(pClass3.getName());
	}
}
