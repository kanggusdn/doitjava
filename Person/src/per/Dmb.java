package per;

public class Dmb extends Phone {
	int channel = 0;

	Dmb(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �����մϴ�.");
	}

	void turnOffDmb() {
		System.out.println("DMB ��� ������ �����մϴ�.");
	}
}
