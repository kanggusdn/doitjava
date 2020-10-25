package upgrade;

public class Chapter09_Constant {
	int num = 10;
	final int NUM = 100;

	public static void main(String[] args) {
		Chapter09_Constant cons = new Chapter09_Constant();
		cons.num = 50;
//		cons.NUM = 200;

		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}
