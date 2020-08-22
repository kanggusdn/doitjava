/*
* 메트로폴리스의 조건
* 1. 수도이고 인구가 100만 이상
* 2. 부자가 50만 이상
* 1, 2 중 하나만 만족하면 메트로폴리스
*/

public class boolean2 {
	public static void main(String[] args) {
		boolean isCapital = false;
		int citizens = 0;
		int riches = 0;
		boolean isMetro = false;
				
		System.out.println("현재 도시는 메트로폴리스입니까?");
		isCapital = false;
		citizens = 150;  //만 단위를 사용
		riches = 80;
				
		if (isCapital && citizens >= 100) {
			isMetro = true;
		} else if (riches >= 50) {
				isMetro = true;
		} else {
			isMetro = false;
		}
				
		System.out.println("수도여부: " + isCapital);
		System.out.println("인구수: " + citizens + "만 명");
		System.out.println("부자수 " + riches + "만 명");
		System.out.println(isMetro ? "메트로폴리스입니다." : "메트로폴리스가 아닙니다.");
	}
}
