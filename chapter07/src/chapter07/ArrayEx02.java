package chapter07;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		arr1={10,20,30,40,50,60,70,80};	한 번 선언하면 다시 선언 불가능
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) { // index -1 까지만 범위로 사용
			sum1 += arr1[i];
		}
		System.out.println(sum1);

		int[] arr2 = new int[5]; // 선호하는 선언 방식
//		arr2={1,2,3,4,5};
		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 }; // 대괄호 안에 다시 숫자를 기입하지 않음
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

		arr1 = new int[] { 1, 2, 3, 4, 5 };		// 자바는 new라는 개념으로 새로 만들면 다른 곳에 대입을 다시 할 수 있음
	}
}
