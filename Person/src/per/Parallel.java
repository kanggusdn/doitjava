package per;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Parallel {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�", "���ٽ�", "�ں���");
		
		//���� ó��
		Stream<String> stream = list.stream();
		stream.forEach(Parallel::print);
		
		System.out.println();
		
		//���� ó��
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(Parallel::print);
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}

