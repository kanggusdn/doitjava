package upgrade;

public class Chapter07_BookArray {
	public static void main(String[] args) {
		Chapter07_Book[] library = new Chapter07_Book[5];

		library[0] = new Chapter07_Book("�¹���", "������");
		library[1] = new Chapter07_Book("���̾�", "�츣�� �켼");
		library[2] = new Chapter07_Book("��� �� ���ΰ�", "���ù�");
		library[3] = new Chapter07_Book("����", "�ڰ渮");
		library[4] = new Chapter07_Book("�����", "�������丮");

		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}