package per;

import java.util.Scanner;

public class GaBaBo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, �� �� �ϳ��� ����: ");
		System.out.print("A> ");
		String strA = sc.next();
		System.out.print("B> ");
		String strB = sc.next();
		
		if(strA.equals("����")) {
			switch(strB) {
			case "����":
			System.out.print("�����ϴ�.");
			break;
			case "����":
			System.out.println("�����ϴ�.");
			break;
			case "��":
			System.out.println("�̰���ϴ�.");
			break;
			default:
			System.out.print("����, ����, �� �߿����� �Է��� �� �ֽ��ϴ�.");
			break;
			}
		}
		else if(strA.equals("����")) {
			switch(strB) {
				case "����":
			System.out.print("�̰���ϴ�.");
				break;
				case "����":
			System.out.println("�����ϴ�.");
				break;
				case "��":
			System.out.println("�����ϴ�.");
				break;
				default:
			System.out.print("����, ����, �� �߿����� �Է��� �� �ֽ��ϴ�.");
				break;
			}
		}	
		else if(strA.equals("��")) {
			switch(strB) {
				case "����":
			System.out.print("�����ϴ�.");
				break;
				case "����":
			System.out.println("�̰���ϴ�.");
				break;
				case "��":
			System.out.println("�����ϴ�.");
				break;
			default:
			System.out.print("����, ����, �� �߿����� �Է��� �� �ֽ��ϴ�.");
			break;
			}
		}
		else {
			System.out.print("����, ����, �� �߿����� �Է��� �� �ֽ��ϴ�.");
		}
		sc.close();
	}
}