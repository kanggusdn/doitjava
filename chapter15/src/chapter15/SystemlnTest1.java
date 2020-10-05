package chapter15;

import java.io.IOException;

public class SystemlnTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");

		int i;
		try {
			i = System.in.read();	//System.in.read(): 1바이트를 읽어 들이는 명령어
			System.out.println(i);
			System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
