package upgrade;

import java.io.IOException;

public class Chapter15_SystemInTest {
	public static void main(String[] args) throws IOException {
//		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������.");
		System.out.println("���ĺ� �������� ���� [Enter]�� ��������.");

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
