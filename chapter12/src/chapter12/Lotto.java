package chapter12;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	static short getNumber() {
		return (short) (Math.random() * 45 + 1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		short[] lotto = { 0, 0, 0, 0, 0, 0 };
		short i, k, num;
		int c;
		char dupl = 'N';

		System.out.printf("[메뉴]\n");
		System.out.printf("<1> 로또 번호 뽑기 <2>종료\n");

		while (true) {
			c = s.nextInt();

			if (c == 1) {
				System.out.printf("** 로또 추첨을 시작합니다. ** \n\n");
				for (i = 0; i < 6;) {

					num = getNumber();

					for (k = 0; k < 6; k++)

						if (lotto[k] == num)
							dupl = 'Y';
					if (dupl == 'N')
						lotto[i++] = num;
					else
						dupl = 'N';
				}

				System.out.printf("추첨된 로또 번호 ==> ");
				for (i = 0; i < 6; i++) {

					System.out.printf("%d  ", lotto[i]);
				}
				System.out.printf("\n");

				System.out.printf("정렬한 로또 번호 ==> ");
				Arrays.sort(lotto);
				for (i = 0; i < 6; i++) {

					System.out.printf("%d  ", lotto[i]);
				}
			}
			if (c == 2) {
				System.out.printf("종료\n");
				break;
			}
		}
	}
}
