package p2;

import java.util.Scanner;

public class Evenodd2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요: ");
		int num = sc.nextInt();
		if(num % 3 == 0) {
		System.out.println("입력한 숫자는 3의 배수입니다.");
		} else {
		System.out.println("입력한 숫자는 3의 배수가 아닙니다.");
		}
		sc.close();
	}
}
