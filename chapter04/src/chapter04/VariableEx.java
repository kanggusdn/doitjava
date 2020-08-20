package chapter04;

public class VariableEx {
	public static void main(String[] args) {
		System.out.println("영남분식입니다.");
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		int ddeok = 3000;  // 떡볶이 3000원
		int sundae = 3000; // 순대 3000원
		int oden = 500;    // 오뎅 500원
		int gimbap = 2000; // 김밥 2000원
		
		int order1 = 0, order2 = 0, order3 = 0, order4 = 0; //변수를 선언한 후 초기값을 넣어주는 것이 좋습니다.
		//변수의 초기값은 숫자는 0, boolean은 false, 문자열은 "", char형은 0으로 초기화합니다.
		order1 = 2;
		order2 = 1;
		order3 = 6;
		order4 = 1;
		
		int res1 = ddeok * order1;
		int res2 = sundae * order2;
		int res3 = oden * order3;
		int res4 = gimbap * order4;
		
		System.out.println("떡볶이는 " + order1 + "인분 주문하여서 금액은 " + res1 + "원입니다.");
		System.out.println("순대는 " + order1 + "인분 주문하여서 금액은 " + res2 + "원입니다.");
		System.out.println("오뎅은 " + order1 + "인분 주문하여서 금액은 " + res3 + "원입니다.");
		System.out.println("김밥은 " + order1 + "인분 주문하여서 금액은 " + res4 + "원입니다.");
		System.out.println("총 금액은 " + (res1 + res2 + res3 + res4) + "원입니다.");
		System.out.print("출력");
		System.out.print("출력\n");
		System.out.print("출력");
	}
}
