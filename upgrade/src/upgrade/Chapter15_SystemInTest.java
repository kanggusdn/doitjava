package upgrade;

import java.io.IOException;

public class Chapter15_SystemInTest {
	public static void main(String[] args) throws IOException {
//		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요.");

		int i;
		try {
			while ((i = System.in.read()) != -1) {
				System.out.print((char) i);
			}
//			i = System.in.read();
//			System.out.println(i);
//			System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
