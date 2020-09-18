package chapter11;

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class<?> pClass = Class.forName("chapter11.Person");	//<?> 모든 객체를 받아들이는 주문(?)
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}
}
