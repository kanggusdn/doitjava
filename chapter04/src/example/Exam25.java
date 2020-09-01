package example;

public class Exam25 {
	public static void main(String[] args) {
		System.out.println("소수 출력: ");
		for(int i=1; i<=1_000; i++) {
			if(isPrimeNumber(i))
				System.out.print(i+" ");
		}
	}

	public static boolean isPrimeNumber(int n) {
		if( n == 1 ) return false;
		
		boolean b = true;
		
		for(int i=2; i<n; i++) {
			
			if(n%i == 0) {
				b = false;
				break;
			}
		}
		return b;
	}
}