package chapter12;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();

	public void push(String data) { // 스택에 자료 추가
		arrayStack.add(data);
	}

	public String pop() { // 자료 꺼내기
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}

		return (arrayStack.remove(len - 1)); // 제일 마지막을 삭제하면서 리턴
	}
}

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
