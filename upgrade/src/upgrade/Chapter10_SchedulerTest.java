package upgrade;

import java.io.IOException;

public class Chapter10_SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� ����� �����ϼ���.");
		System.out.println("R : �� �� ���ʷ� �Ҵ� ");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ� ");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ� ");

		int ch = System.in.read();
		Chapter10_Scheduler scheduler = null;

		if (ch == 'R' || ch == 'r') {
			scheduler = new Chapter10_RoundRobin();
		} else if (ch == 'L' || ch == 'l') {
			scheduler = new Chapter10_LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			scheduler = new Chapter10_PriorityAllocation();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}

		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
