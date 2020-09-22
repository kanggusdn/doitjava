package chapter12;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();	//스택 자료형 지원함 / 큐는 자료형은 있으나 new로 생성 불가. 링크드 리스트로 생성
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {	//비었는지 물음. ! = false
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getVlaue() + "원");
		}
	}
}
