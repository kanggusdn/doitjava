package chapter08;

public class ComputerExtends extends CalculatorExtends {
	@Override	/*������̼�(@) ��� �������. �ٸ�, �����Ǹ� ���� �Ͱ� ��Ÿ ����*/
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle()");
		return Math.PI * r * r;
	}
}
//�����Ǵ� ���� �޼ҵ带 �����ؾ� �ϴ� ��