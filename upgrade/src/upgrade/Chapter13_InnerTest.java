package upgrade;

class OutClass {
	private int num = 10;
	private static int sNum = 20;

	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;

//	private InClass inClass;

//	public OutClass() {
//		inClass = new InClass();
//	}

//	class InClass {
//		int inNum = 100;

		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
//			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}

		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	}
}
//	public void usingClass() {
//		inClass.inTest();
//	}
//}

public class Chapter13_InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ������ �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();
//		System.out.println("�ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ������ ��� ȣ��");
//		outClass.usingClass();
	}
}