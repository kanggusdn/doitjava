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

		System.out.printf("[�޴�]\n");
		System.out.printf("<1> �ζ� ��ȣ �̱� <2>����\n");

		while (true) {
			c = s.nextInt();

			if (c == 1) {
				System.out.printf("** �ζ� ��÷�� �����մϴ�. ** \n\n");
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

				System.out.printf("��÷�� �ζ� ��ȣ ==> ");
				for (i = 0; i < 6; i++) {

					System.out.printf("%d  ", lotto[i]);
				}
				System.out.printf("\n");

				System.out.printf("������ �ζ� ��ȣ ==> ");
				Arrays.sort(lotto);
				for (i = 0; i < 6; i++) {

					System.out.printf("%d  ", lotto[i]);
				}
			}
			if (c == 2) {
				System.out.printf("����\n");
				break;
			}
		}
	}
}
