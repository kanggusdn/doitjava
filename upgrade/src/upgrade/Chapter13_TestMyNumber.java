package upgrade;

public class Chapter13_TestMyNumber {
	public static void main(String[] args) {
		Chapter13_MyNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 20));
	}
}