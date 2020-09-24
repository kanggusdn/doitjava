package chapter13;

class OutClass {	//외부 클래스
	private int num = 10;	//외부 클래스 private 변수
	private static int sNum = 20;	//외부 클래스 정적 변수
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; 외부 클래스의 인스턴스 변수는 사용할 수 없음.
		System.out.println("InStaticClass inNum = " + +inNum + "(내부 클래스의 인스턴스 변수 사용)");
		System.out.println("InStaticClass sInNum = " + +sInNum + "(내부 클래스의 정적 변수 사용)");
		System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() {
			//num += 10;
			//inNum += 10;	외부 글래스와 내부 클래스의 인스턴스 변수는 사용할 수 없음.
		System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
	}
	
	private InClass inClass;	//내부 클래스 자료형 변수를 먼저 선언
	
	public OutClass() {			//외부 클래스 디폴트 생성자. 외부 클래스가 생성된 후에 내부 클래스 생성 가능
		inClass = new InClass();
	}
	
	class InClass {		//인스턴스 내부 클래스
		int inNum = 100;	//내부 클래스의 인스턴스 변수
		//static int sInNum = 200; 인스턴스 내부 클래스에 정적 변수 선언 불가능.
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
	}
	//static void sTest() { 정적 메소드 역시 정의 불가능, 호출은 정적 메소드도 가능
	//}
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest2 {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();	//내부 클래스 기능 호출
	}
}
