package per;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxed {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };

		IntStream intStream = Arrays.stream(intArray);	//IntStream.of(intArray)�� ����ص� ��.
		intStream.asDoubleStream().forEach(d -> System.out.println(d));

		System.out.println();

		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));	//.intValue()�� �����ص� ��. boxed�� �־�� intValue ��� ����.
	}
}
