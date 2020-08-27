package example;

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?: ");
		int line = sc.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				if(j%2 == 0) {
					System.out.print("$");
				} else {
				System.out.print("\\"); //역슬러시 출력은 \ 2개를 사용
				}
			}
			System.out.println();

		}
		sc.close();
	}
}