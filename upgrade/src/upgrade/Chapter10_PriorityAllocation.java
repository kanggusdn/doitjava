package upgrade;

public class Chapter10_PriorityAllocation implements Chapter10_Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� skill ���� ���� �������� �켱������ ����մϴ�.");
	}
}
