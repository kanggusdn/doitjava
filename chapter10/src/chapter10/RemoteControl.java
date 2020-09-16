package chapter10;

public interface RemoteControl {
	public int MAX_VOLUME = 10;	//필드는 상수
	public int MIN_VOLUME = 0;

	public void turnOn(); // {} 추상 메소드이므로 중괄호를 주면 안 됨.

	public void turnOff();

	public void setVolume(int volume);

	default void setMute(boolean mute) {	//필요하다면 디폴트나 정적 메소드를 가질 수 있음.
		if (mute) {
			System.out.println("음소거 상태로 설정합니다.");
		} else {
			System.out.println("음소거 상태를 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
