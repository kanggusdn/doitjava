package chapter12;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();	//���� �ڷ��� ������ / ť�� �ڷ����� ������ new�� ���� �Ұ�. ��ũ�� ����Ʈ�� ����
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {	//������� ����. ! = false
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : " + coin.getVlaue() + "��");
		}
	}
}
