package upgrade;

public class Chapter14_AutoCloseTest {
	public static void main(String[] args) {
		try (Chapter14_AutoCloseObj obj = new Chapter14_AutoCloseObj()) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}
}
