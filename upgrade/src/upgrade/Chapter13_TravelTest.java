package upgrade;

import java.util.ArrayList;
import java.util.List;

public class Chapter13_TravelTest {
	public static void main(String[] args) {
		Chapter13_TravelCustomer customerLee = new Chapter13_TravelCustomer("�̼���", 40, 100);
		Chapter13_TravelCustomer customerKim = new Chapter13_TravelCustomer("������", 20, 100);
		Chapter13_TravelCustomer customerHong = new Chapter13_TravelCustomer("ȫ�浿", 13, 50);
		List<Chapter13_TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);

		System.out.println("== �� ��� �߰��� ������� ��� ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("�� ���� ����� :" + total + "�Դϴ�.");

		System.out.println("== 20�� �̻� �� ��� �����Ͽ� ��� ==");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));
	}
}