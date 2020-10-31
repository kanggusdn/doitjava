package upgrade;

public class Chapter10_BookShelfTest {
	public static void main(String[] args) {
		Chapter10_Queue shelfQueue = new Chapter10_BookShelf();
		shelfQueue.enQueue("ลยน้ป๊ธฦ 1");
		shelfQueue.enQueue("ลยน้ป๊ธฦ 2");
		shelfQueue.enQueue("ลยน้ป๊ธฦ 3");

		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
