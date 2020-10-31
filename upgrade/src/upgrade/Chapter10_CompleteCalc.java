package upgrade;

public class Chapter10_CompleteCalc extends Chapter10_Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0)
			return num1 / num2;
		else
			return Chapter10_Calc.ERROR;
	}

	@Override
	public void decription() {
		super.decription();
	}

	public void showInfo() {
		System.out.println("Chapter10_Calc 인터페이스를 구현하였습니다.");
	}
}
