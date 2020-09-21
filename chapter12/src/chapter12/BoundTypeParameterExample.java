package chapter12;

public class BoundTypeParameterExample {
	public static void main(String[] args) {
		int result1 = Util3.compare(10, 20);	//둘의 뺄셈은 앞이 적으므로 -1
		System.out.println(result1);			//compare:둘을 비교해 앞의 값이 크냐, 같냐, 작냐에 따라 -1, 0, 1을 출력함.
		
		int result2 = Util3.compare(4.5, 3);	//둘의 뺌셈은 앞이 크므로 +1
		System.out.println(result2);
	}
}
