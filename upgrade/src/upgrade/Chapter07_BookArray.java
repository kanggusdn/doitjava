package upgrade;

public class Chapter07_BookArray {
	public static void main(String[] args) {
		Chapter07_Book[] library = new Chapter07_Book[5];

		library[0] = new Chapter07_Book("태백산맥", "조정래");
		library[1] = new Chapter07_Book("데미안", "헤르만 헤세");
		library[2] = new Chapter07_Book("어떻게 살 것인가", "유시민");
		library[3] = new Chapter07_Book("토지", "박경리");
		library[4] = new Chapter07_Book("어린왕자", "생텍쥐페리");

		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}