package chapter09;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {	//final일 경우 상속 받는 자식이 재정의할 수 없음
		startCar();
		drive();
		stop();
		turnOff();
	}
}
