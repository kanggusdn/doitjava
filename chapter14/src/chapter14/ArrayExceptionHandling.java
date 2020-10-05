package chapter14;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		try {	//예외가 발생할 수 있는 코드를 삽입.
			int[] arr = new int[3];
			arr[2] = 100;
			System.out.println("정상 실행했습니다.");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // 한꺼번에 처리할 때 or 기호를 씀. 또는 catch를 여러개 씀.
			System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어나거나 산술 연산에 문제가 발생했습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("파이널리는 무조건 실행하는 구간입니다.");
		}
	}
}
//Exception을 사용하면 어떤 오류든지 예외 처리함.