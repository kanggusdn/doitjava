package upgrade;

public class Chapter07_EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = { "Java", "Android", "C", "JavaScript", "Python" };

		for (String lang : strArray) {
			System.out.println(lang);
		}
	}
}