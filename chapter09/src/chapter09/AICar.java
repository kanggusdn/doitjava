package chapter09;

public class AICar extends Car{
	@Override
	public void drive() {	//�߻� �޼ҵ�� �ݵ�� �������ؾ� ��.
		System.out.println("���� �����մϴ�.");
		System.out.println("�ڵ����� �˾Ƽ� ������ ��ȯ�մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
}
