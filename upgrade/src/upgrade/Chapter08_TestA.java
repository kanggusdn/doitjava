package upgrade;

public class Chapter08_TestA {
	int num;

	void aaa() {
		System.out.println("aaa() Ãâ·Â");
	}

	public static void main(String[] args) {
		Chapter08_TestA a1 = new Chapter08_TestA();
		a1.aaa();
		Chapter08_TestA a2 = new Chapter08_TestA();
		a2.aaa();
	}
}
