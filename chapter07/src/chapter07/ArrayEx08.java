package chapter07;

public class ArrayEx08 {
	public static void main(String[] args) {
		int[] arr = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90};
		//arr�� ��ҵ��� ���� 0���� ��� �ٲ� �� �� ����� ���� 0���� Ȯ���� ���� ����ϼ���.
		for(int i =0; i<arr.length; i++) {
			arr[i] = 0;
		System.out.print(arr[i]);
		}
	}
}