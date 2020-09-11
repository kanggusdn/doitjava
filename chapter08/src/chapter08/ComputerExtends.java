package chapter08;

public class ComputerExtends extends CalculatorExtends {
	@Override	/*어노테이션(@) 없어도 상관없음. 다만, 재정의를 위한 것과 오타 방지*/
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()");
		return Math.PI * r * r;
	}
}
//재정의는 같은 메소드를 정의해야 하는 것