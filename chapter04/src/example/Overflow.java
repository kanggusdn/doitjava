package example;

public class Overflow {
	public static void main(String[] args) {
		byte bNum = Byte.MAX_VALUE;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		int iNum = Integer.MIN_VALUE; // int는 integer로 사용
		System.out.println(iNum);
		iNum--;
		System.out.println(iNum);
	}
}
