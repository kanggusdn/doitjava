package example;

import java.util.Scanner;

public class Exam_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i=2; i<=n; i++) {
			cnt++;
			for(int j=2; j<=i/2; j++) {
				if(i % j == 0) {
					cnt--;
					break;
				}
			}
		}
		System.out.println("입력한 숫자의 \"소수\"의 개수는 " + cnt + "개입니다.");
		sc.close();
	}
}
