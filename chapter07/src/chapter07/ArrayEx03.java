package chapter07;

public class ArrayEx03 {
	public static void main(String[] args) {
		// 10���� �Է��� �� �ִ� �迭�� �����ϰ� 1���� 10���� ������ ��
		// for���� ����ؼ� �հ踦 ����ϼ���.(55)
		int sum = 0;
		int[] Arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < Arr.length; i++) {
			sum += Arr[i];
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}
}
//int[] Arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};
//int[] Arr3 = new int[10];
//for(int i = 0; i <10; i++) {
//	Arr3[i] = i + 1;
//}