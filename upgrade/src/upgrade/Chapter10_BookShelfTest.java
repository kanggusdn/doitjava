package upgrade;

public class Chapter10_BookShelfTest {
	public static void main(String[] args) {
		Chapter10_Queue shelfQueue = new Chapter10_BookShelf();
		shelfQueue.enQueue("�¹��� 1");
		shelfQueue.enQueue("�¹��� 2");
		shelfQueue.enQueue("�¹��� 3");

		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
