package upgrade;

public abstract class Chapter10_Calculator implements Chapter10_Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {

		return num1 - num2;
	}
}
