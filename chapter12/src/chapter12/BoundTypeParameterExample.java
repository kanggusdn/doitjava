package chapter12;

public class BoundTypeParameterExample {
	public static void main(String[] args) {
		int result1 = Util3.compare(10, 20);	//���� ������ ���� �����Ƿ� -1
		System.out.println(result1);			//compare:���� ���� ���� ���� ũ��, ����, �۳Ŀ� ���� -1, 0, 1�� �����.
		
		int result2 = Util3.compare(4.5, 3);	//���� ������ ���� ũ�Ƿ� +1
		System.out.println(result2);
	}
}
