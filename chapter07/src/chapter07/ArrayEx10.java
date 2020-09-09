package chapter07;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		// index의 값은 앞의 두 index 값을 더해서 대입하고
		// arr의 값을 모두 출력

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
