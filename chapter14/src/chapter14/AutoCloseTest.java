package chapter14;

public class AutoCloseTest {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()) {
			int[] arr = new int[3];
			arr[3] = 100;
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}
}
