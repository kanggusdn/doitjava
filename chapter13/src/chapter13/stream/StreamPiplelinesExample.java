package chapter13.stream;

import java.util.Arrays;
import java.util.List;

public class StreamPiplelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("홍길동", Member.MALL, 30), new Member("김나리", Member.FEMALL, 20),
				new Member("신용권", Member.MALL, 45), new Member("박수미", Member.FEMALL, 27));

		double ageAvg = list.stream().filter(m -> m.getSex() == Member.MALL).mapToInt(Member::getAge).average()
				.getAsDouble();

		System.out.println("남자 평균 나이: " + ageAvg);
	}
}