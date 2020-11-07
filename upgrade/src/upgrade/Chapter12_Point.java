package upgrade;

public class Chapter12_Point<T, V> {
	T x;
	V y;

	Chapter12_Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
}
