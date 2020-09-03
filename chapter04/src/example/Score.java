package example;

import java.util.Scanner;

/*
 * 국어 영어 수학 점수를 입력 받아서
 * 평균을 출력한 후
 * 100 ~ 91점은 A등급
 * 90 ~ 81점은 B등급
 * 80 ~ 71점은 C등급
 * 나머지는 F등급
 * 
 * 평균 점수와 등급을 출력하세요.
 *
 */

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = 100, E = 100, M = 100;
		System.out.println("국어 점수 입력: ");
		K = sc.nextInt();
		System.out.println("영어 점수 입력: ");
		E = sc.nextInt();
		System.out.println("수학 점수 입력: ");
		M = sc.nextInt();
		int sum = K + E + M;
		double avg = sum / 3.0;

		if (avg >= 91) {
			System.out.println("A등급입니다.");
		} else if (avg >= 81) {
			System.out.println("B등급입니다.");
		} else if (avg >= 71) {
			System.out.println("C등급입니다.");
		} else {
			System.out.println("F등급입니다.");
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
 *  System.out.println("당신의 평균 점수는 " + avg + "점이고 " + grade + "등급입니다.");
 */