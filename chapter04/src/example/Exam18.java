package example;

import java.util.Scanner;

public class Exam18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력할까요?: ");
		int line = sc.nextInt();
		
		for(int i=line - 1; i>=0; i--) {
			for(int j=0; j<line; j++) {
				if(j < line - i - 1) {
				System.out.print(" ");
				} else {
				System.out.print("*");
				}
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
			sc.close();
	}
}