package per;

public class BoxEx {
	public static void main(String[] args) {
		Box_1<String> box1 = new Box_1<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		
		Box_1<Integer> box2 = new Box_1<Integer>();
		box2.set(6);
		int value = box2.get();	
		System.out.println(value);
		}
}
