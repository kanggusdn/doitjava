package chapter13.stream;

import java.util.Arrays;
import java.util.List;

public class StreamPiplelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("ȫ�浿", Member.MALL, 30), new Member("�質��", Member.FEMALL, 20),
				new Member("�ſ��", Member.MALL, 45), new Member("�ڼ���", Member.FEMALL, 27));

		double ageAvg = list.stream().filter(m -> m.getSex() == Member.MALL).mapToInt(Member::getAge).average()
				.getAsDouble();

		System.out.println("���� ��� ����: " + ageAvg);
	}
}