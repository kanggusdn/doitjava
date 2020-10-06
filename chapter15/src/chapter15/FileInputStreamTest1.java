package chapter15;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileReader fis = null;

		try {
			fis = new FileReader("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			int word;
			while((word = fis.read()) != -1) {
				System.out.print((char)word);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}
}
