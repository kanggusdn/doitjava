package chapter14;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		try {	//���ܰ� �߻��� �� �ִ� �ڵ带 ����.
			int[] arr = new int[3];
			arr[2] = 100;
			System.out.println("���� �����߽��ϴ�.");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // �Ѳ����� ó���� �� or ��ȣ�� ��. �Ǵ� catch�� ������ ��.
			System.out.println(e.getMessage());
			System.out.println("�迭�� ������ ����ų� ��� ���꿡 ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		} finally {
			System.out.println("���̳θ��� ������ �����ϴ� �����Դϴ�.");
		}
	}
}
//Exception�� ����ϸ� � �������� ���� ó����.