package chapter04;
/*
 * ���ڸ� �Է� �޾Ƽ� �Է� ���� ���ڰ� Ȧ������ ¦������
 * ����ϼ���.
 */

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��� �ּ���: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}
		sc.close();
	}
}
