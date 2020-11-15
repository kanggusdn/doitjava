package upgrade;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person2 implements Serializable {
	private static final long serialVersionUID = -1503252402544036183L;
	String name;
	String job;

	public Person2() {
	}

	public Person2(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return name + "," + job;
	}
}

public class Chapter15_SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person2 personAhn = new Person2("안재용", "대표이사");
		Person2 personKim = new Person2("김철수", "상무이사");

		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person2 p1 = (Person2) ois.readObject();
			Person2 p2 = (Person2) ois.readObject();

			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
