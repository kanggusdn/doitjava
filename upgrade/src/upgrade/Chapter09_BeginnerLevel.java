package upgrade;

public class Chapter09_BeginnerLevel extends Chapter09_PlayerLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("Jump�� �� ������.");
	}

	@Override
	public void turn() {
		System.out.println("Turn�� �� ������.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** �ʺ��� �����Դϴ�. *****");
	}
}
