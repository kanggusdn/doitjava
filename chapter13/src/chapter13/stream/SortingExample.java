package chapter13.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream.sorted().forEach(n -> System.out.print(n + ","));
		System.out.println();
		
		//객체 요소의 경우 comparable을 이용하여 비교할 수 있도록 구현한 후 정렬 혹은 comparator로 매개 변수 삽입 후 사용
		List<Student> studentList = Arrays.asList(new Student("홍길동", 30), new Student("신용권", 10), new Student("유미선", 20));
		studentList.stream().sorted().forEach(s -> System.out.print(s.getScore() + ","));	//forEach(System.out::println);으로 줄이기 가능
		System.out.println();
		studentList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s.getScore() + ","));	//Comparator.reverseOrder() 역순 정렬이 내재됨
	}
}
