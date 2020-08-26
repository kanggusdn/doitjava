package example;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력해 주세요: ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력해 주세요: ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Same");
		} else {
			System.out.println("Diffrent");
		}
		
		if(num1 == num2) System.out.println("Same2");
		else System.out.println("Diffrent2");
		
		System.out.println(num1 == num2 ? "Same3" : "Diffrent3");
		
		sc.close();
	}
}
