/*
* ��Ʈ���������� ����
* 1. �����̰� �α��� 100�� �̻�
* 2. ���ڰ� 50�� �̻�
* 1, 2 �� �ϳ��� �����ϸ� ��Ʈ��������
*/

public class boolean2 {
	public static void main(String[] args) {
		boolean isCapital = false;
		int citizens = 0;
		int riches = 0;
		boolean isMetro = false;
				
		System.out.println("���� ���ô� ��Ʈ���������Դϱ�?");
		isCapital = false;
		citizens = 150;  //�� ������ ���
		riches = 80;
				
		if (isCapital && citizens >= 100) {
			isMetro = true;
		} else if (riches >= 50) {
				isMetro = true;
		} else {
			isMetro = false;
		}
				
		System.out.println("��������: " + isCapital);
		System.out.println("�α���: " + citizens + "�� ��");
		System.out.println("���ڼ� " + riches + "�� ��");
		System.out.println(isMetro ? "��Ʈ���������Դϴ�." : "��Ʈ���������� �ƴմϴ�.");
	}
}
