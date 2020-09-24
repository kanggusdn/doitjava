package chapter13;

class OutClass {	//�ܺ� Ŭ����
	private int num = 10;	//�ܺ� Ŭ���� private ����
	private static int sNum = 20;	//�ܺ� Ŭ���� ���� ����
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {	//���� ���� Ŭ������ �Ϲ� �޼ҵ�
			//num += 10; �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
		System.out.println("InStaticClass inNum = " + +inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
		System.out.println("InStaticClass sInNum = " + +sInNum + "(���� Ŭ������ ���� ���� ���)");
		System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}
		
		static void sTest() {	//���� ���� Ŭ������ ���� �޼ҵ�
			//num += 10;
			//inNum += 10;	�ܺ� �۷����� ���� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
		System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	}
	private InClass inClass;	//���� Ŭ���� �ڷ��� ������ ���� ����
	
	public OutClass() {			//�ܺ� Ŭ���� ����Ʈ ������. �ܺ� Ŭ������ ������ �Ŀ� ���� Ŭ���� ���� ����
		inClass = new InClass();
	}
	
	class InClass {		//�ν��Ͻ� ���� Ŭ����
		int inNum = 100;	//���� Ŭ������ �ν��Ͻ� ����
		//static int sInNum = 200; �ν��Ͻ� ���� Ŭ������ ���� ���� ���� �Ұ���.
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ����)");
		}
	}
	//static void sTest() { ���� �޼ҵ� ���� ���� �Ұ���, ȣ���� ���� �޼ҵ嵵 ����
	//}
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();	//���� Ŭ���� ��� ȣ��
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();	//�ܺ� Ŭ������ �������� �ʰ� �ٷ� ���� ���� Ŭ���� ���� ����
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼ҵ� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼ҵ� ȣ��");
		OutClass.InStaticClass.sTest();
		}
	}