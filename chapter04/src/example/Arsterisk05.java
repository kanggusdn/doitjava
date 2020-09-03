package example;

public class Arsterisk05 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i - 1; j++) {
//				if(i-1 ==j) {
//					System.out.print(i);
//			} else {
//				System.out.print(" ");
//			}				
				System.out.print(" ");
			}
			System.out.println(i);
		}
	}
}
