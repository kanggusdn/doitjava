package per;

public class Dmb extends Phone {
	int channel = 0;

	Dmb(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
}
