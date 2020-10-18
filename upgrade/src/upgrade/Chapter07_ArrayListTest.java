package upgrade;

import java.util.ArrayList;

public class Chapter07_ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Chapter07_Book> library = new ArrayList<Chapter07_Book>();

		library.add(new Chapter07_Book("�¹���", "������"));
		library.add(new Chapter07_Book("���̾�", "�츣�� �켼"));
		library.add(new Chapter07_Book("��� �� ���ΰ�", "���ù�"));
		library.add(new Chapter07_Book("����", "�ڰ渮"));
		library.add(new Chapter07_Book("�����", "�������丮"));

		for (int i = 0; i < library.size(); i++) {
			Chapter07_Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();

		System.out.println("=== ���� for�� ��� ===");
		for (Chapter07_Book book : library) {
			book.showBookInfo();
		}
	}
}