package example;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��� �ּ���: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("¦��");
		}	else {
			System.out.println("Ȧ��");
		}
		
		if(num % 2 == 0) System.out.println("¦��");
		else System.out.println("Ȧ��");
		
		System.out.println(num % 2 == 0 ? "¦��" : "Ȧ��");
		
		String str = "";
		if(num % 2 == 0) {
			str = "¦��";
		}	else {
			str = "Ȧ��";
		}
		System.out.println(str);
		
		sc.close();
	
	}
	
}
