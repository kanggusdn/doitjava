package example;

import java.util.Scanner;

/*
 * ���� ���� ���� ������ �Է� �޾Ƽ�
 * ����� ����� ��
 * 100 ~ 91���� A���
 * 90 ~ 81���� B���
 * 80 ~ 71���� C���
 * �������� F���
 * 
 * ��� ������ ����� ����ϼ���.
 *
 */

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = 100, E = 100, M = 100;
		System.out.println("���� ���� �Է�: ");
		K = sc.nextInt();
		System.out.println("���� ���� �Է�: ");
		E = sc.nextInt();
		System.out.println("���� ���� �Է�: ");
		M = sc.nextInt();
		int sum = K + E + M;
		double avg = sum / 3.0;

		if (avg >= 91) {
			System.out.println("A����Դϴ�.");
		} else if (avg >= 81) {
			System.out.println("B����Դϴ�.");
		} else if (avg >= 71) {
			System.out.println("C����Դϴ�.");
		} else {
			System.out.println("F����Դϴ�.");
		}
	    sc.close();
		}
}

/* int grade = 0;
 * if(avg >= 91) {
 * grade = 'A';
 * } else if(avg >= 81) {
 * grade = 'B';
 * } else if(avg >= 71) {
 * grade = 'C';
 * } else
 * grade = 'F';'
 * }
 * 
 * switch((int)avg / 10) {
 * 	case 10:
 *  case 9:
 *  	grade = 'A';
 *  	break;
 *  case 8:
 *  	grade = 'B';
 *  	break;
 *  case 7:
 *  	grade = 'C';
 *  	break;
 *  defalut:
 *  	grade = 'F';
 *  }
 *  System.out.println("����� ��� ������ " + avg + "���̰� " + grade + "����Դϴ�.");
 */