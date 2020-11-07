package upgrade;

public class Chapter12_GenericMethod {
	public static <T, V> double makeRectangle(Chapter12_Point<T, V> p1, Chapter12_Point<T, V> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();

		double width = right - left;
		double height = bottom - top;

		return width * height;
	}

	public static void main(String[] args) {
		Chapter12_Point<Integer, Double> p1 = new Chapter12_Point<Integer, Double>(0, 0.0);
		Chapter12_Point<Integer, Double> p2 = new Chapter12_Point<>(10, 10.0);

		double rect = Chapter12_GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
	}
}
