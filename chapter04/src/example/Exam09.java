package example;

public class Exam09 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i++) {			
			sum += i;
		}
		double res = sum /50.0; //���� ����ȯ (double) ���⵵ ��.
		System.out.println(res);
	}
}
