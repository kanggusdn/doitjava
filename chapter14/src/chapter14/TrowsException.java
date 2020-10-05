package chapter14;

public class TrowsException {
	public static void main(String[] args) throws Exception { // throws를 사용해 예외 처리 미루기를 함.
		Class c = Class.forName("java.lang.String");
		System.out.println("프로그램을 종료합니다.");
		try {
			throw new ArithmeticException("메시지");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
