package per;

public class RectangleEx {
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle();
		
		//���簢�� ���� ���ϱ�
		double result1 = myRectangle.areaRectangle(10);
		
		//���簢�� ���� ���ϱ�
		double result2 = myRectangle.areaRectangle(10, 20);
		
		//��� ���
		System.out.println("���簢�� ����: " + result1);
		System.out.println("���簢�� ����: " + result2);
	}
}

