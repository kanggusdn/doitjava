package chapter07;

public class Arr_test {
	public static void main(String[] args) {
		int sum = 0;
		int[] scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("scores의 배열의 개수: " + scores.length);
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
	}
}
