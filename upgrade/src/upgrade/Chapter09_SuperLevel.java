package upgrade;

public class Chapter09_SuperLevel extends Chapter09_PlayerLevel {

	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� Jump�մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�� ���� ���ϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** ����� �����Դϴ�. *****");
	}
}
