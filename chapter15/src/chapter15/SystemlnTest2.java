package chapter15;

import java.io.IOException;

public class SystemlnTest2 {
	public static void main(String[] args) throws IOException {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������.");

		int i;
		try {
			while ((i = System.in.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
