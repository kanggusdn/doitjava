package per;

public class Arr_test2 {
	public static void main(String[] args) {
		char[] iArr = { 'a', 'b', 'c' };
		String[] sArr = { "����", "��", "��" };
		for (char i = 0; i < 3; i++) {
			System.out.println(iArr[i] + " : " + sArr[i]);
		}

		char[] arr1 = { 1, 2 };
		char[] arr2 = { 3, 4 };
		char[][] array = new char[2][]; // 2���� �迭
		array[0] = arr1;
		array[1] = arr2;

		for (char i = 0; i < array.length; i++) {
//			System.out.println(array[i]);	//array[0], array[1] ���
			for (char j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}		
	}
}
