package example;

import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력할까요?: ");
		int line = sc.nextInt();
		for (int i = line; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if(j == i) {
					System.out.print("@");
				} else {
					System.out.print("$");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
