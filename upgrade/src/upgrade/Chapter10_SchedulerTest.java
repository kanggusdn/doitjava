package upgrade;

import java.io.IOException;

public class Chapter10_SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 방식을 선택하세요.");
		System.out.println("R : 한 명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");

		int ch = System.in.read();
		Chapter10_Scheduler scheduler = null;

		if (ch == 'R' || ch == 'r') {
			scheduler = new Chapter10_RoundRobin();
		} else if (ch == 'L' || ch == 'l') {
			scheduler = new Chapter10_LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			scheduler = new Chapter10_PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}

		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
