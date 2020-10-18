package upgrade;

import java.util.ArrayList;

public class Chapter07_ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Chapter07_Book> library = new ArrayList<Chapter07_Book>();

		library.add(new Chapter07_Book("태백산맥", "조정래"));
		library.add(new Chapter07_Book("데미안", "헤르만 헤세"));
		library.add(new Chapter07_Book("어떻게 살 것인가", "유시민"));
		library.add(new Chapter07_Book("토지", "박경리"));
		library.add(new Chapter07_Book("어린왕자", "생텍쥐페리"));

		for (int i = 0; i < library.size(); i++) {
			Chapter07_Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();

		System.out.println("=== 향상된 for문 사용 ===");
		for (Chapter07_Book book : library) {
			book.showBookInfo();
		}
	}
}