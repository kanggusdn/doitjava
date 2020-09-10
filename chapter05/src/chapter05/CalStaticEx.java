package chapter05;

public class CalStaticEx {
	public static void main(String[] args) {
		CalcStatic calc = new CalcStatic();
		int res1 = CalcStatic.plus(10, 20);
		System.out.println(res1);
		int res2 = calc.plus(10, 20);
		System.out.println(res2);
		int res3 = calc.minus(20, 10);
		System.out.println(res3);
		int res4 = calc.multiply(10, 20);

		CalcStatic calc2 = new CalcStatic();

		System.out.println(calc.num1);
		System.out.println(calc2.num1);

		calc.num1 = 20;
		calc2.num1 = 200;
		System.out.println(calc.num1);
		System.out.println(calc2.num1);

		System.out.println(calc.num2);
		System.out.println(calc2.num2);

		calc.num2 = 30;
		System.out.println(calc.num2);

		calc.num2 = 300;
		System.out.println(calc.num2);

		System.out.println(calc.num2);
	}
}


//double result1 = 10 * 10 * CalcStatic.pi;
//int result2 = CalcStatic.plus(10, 5);
//int result3 = CalcStatic.minus(10, 5);

//CalcStatic calcs = new CalcStatic();

//System.out.println("result1: " + result1);
//System.out.println("result2: " + result2);
//System.out.println("result3: " + result3);
//System.out.println("calcs.pi: " + calcs.pi);