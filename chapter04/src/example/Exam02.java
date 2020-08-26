package example;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¼ýÀÚ¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("Â¦¼ö");
		}	else {
			System.out.println("È¦¼ö");
		}
		
		if(num % 2 == 0) System.out.println("Â¦¼ö");
		else System.out.println("È¦¼ö");
		
		System.out.println(num % 2 == 0 ? "Â¦¼ö" : "È¦¼ö");
		
		String str = "";
		if(num % 2 == 0) {
			str = "Â¦¼ö";
		}	else {
			str = "È¦¼ö";
		}
		System.out.println(str);
		
		sc.close();
	
	}
	
}
