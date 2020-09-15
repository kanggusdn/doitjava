package chapter09;

public class AICar extends Car{
	@Override
	public void drive() {	//추상 메소드는 반드시 재정의해야 함.
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
}
