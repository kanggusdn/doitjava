package per;

public class DmbEx {
	public static void main(String[] args) {
		Dmb dmbCellPhone = new Dmb("자바폰", "검정", 100);
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		System.out.println("채널: " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		dmbCellPhone.sendVoice("바쁘니 나중에 전화주세요.");
		dmbCellPhone.hangUp("전화를 끊습니다.");
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(10);
		dmbCellPhone.turnOffDmb();
	}
}
