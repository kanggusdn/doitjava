package upgrade;

public class Chapter07_ObjectCopy {
	public static void main(String[] args) {
		Chapter07_Book[] bookArray1 = new Chapter07_Book[3];
		Chapter07_Book[] bookArray2 = new Chapter07_Book[3];

		bookArray1[0] = new Chapter07_Book("�¹���", "������");
		bookArray1[1] = new Chapter07_Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Chapter07_Book("��� �� ���ΰ�", "���ù�");

		bookArray2[0] = new Chapter07_Book();
		bookArray2[1] = new Chapter07_Book();
		bookArray2[2] = new Chapter07_Book();

		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}

		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}

		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");

		System.out.println("=== bookArray1 ===");
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}

		System.out.println("=== bookArray2 ===");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}
}
