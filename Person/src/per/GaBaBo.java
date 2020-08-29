package per;

import java.util.Scanner;

public class GaBaBo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위, 바위, 보 중 하나를 선택: ");
		System.out.print("A> ");
		String strA = sc.next();
		System.out.print("B> ");
		String strB = sc.next();
		
		if(strA.equals("가위")) {
			switch(strB) {
			case "가위":
			System.out.print("비겼습니다.");
			break;
			case "바위":
			System.out.println("졌습니다.");
			break;
			case "보":
			System.out.println("이겼습니다.");
			break;
			default:
			System.out.print("가위, 바위, 보 중에서만 입력할 수 있습니다.");
			break;
			}
		}
		else if(strA.equals("바위")) {
			switch(strB) {
				case "가위":
			System.out.print("이겼습니다.");
				break;
				case "바위":
			System.out.println("비겼습니다.");
				break;
				case "보":
			System.out.println("졌습니다.");
				break;
				default:
			System.out.print("가위, 바위, 보 중에서만 입력할 수 있습니다.");
				break;
			}
		}	
		else if(strA.equals("보")) {
			switch(strB) {
				case "가위":
			System.out.print("졌습니다.");
				break;
				case "바위":
			System.out.println("이겼습니다.");
				break;
				case "보":
			System.out.println("비겼습니다.");
				break;
			default:
			System.out.print("가위, 바위, 보 중에서만 입력할 수 있습니다.");
			break;
			}
		}
		else {
			System.out.print("가위, 바위, 보 중에서만 입력할 수 있습니다.");
		}
		sc.close();
	}
}