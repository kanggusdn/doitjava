package p2;

import java.util.Scanner;

public class Evenodd2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��� �ּ���: ");
		int num = sc.nextInt();
		if(num % 3 == 0) {
		System.out.println("�Է��� ���ڴ� 3�� ����Դϴ�.");
		} else {
		System.out.println("�Է��� ���ڴ� 3�� ����� �ƴմϴ�.");
		}
		sc.close();
	}
}
