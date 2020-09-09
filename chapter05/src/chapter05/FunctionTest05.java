package chapter05;

public class FunctionTest05 {
	public static void main(String[] args) {
		Obj obj = new Obj();
		int res = obj.add(1, 2);
		System.out.println(res);
	}
}

class Obj {
	int add(int a, int b) {
		return a + b + c;
	}
	int c = 10;	//아래쪽에서 선언해도 오류 없이 선언됨.
}
