package per;

public class DmbEx {
	public static void main(String[] args) {
		Dmb dmbCellPhone = new Dmb("�ڹ���", "����", 100);
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		System.out.println("ä��: " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������.");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		dmbCellPhone.sendVoice("�ٻڴ� ���߿� ��ȭ�ּ���.");
		dmbCellPhone.hangUp("��ȭ�� �����ϴ�.");
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(10);
		dmbCellPhone.turnOffDmb();
	}
}
