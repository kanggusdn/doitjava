package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "김자바", "람다식", "박병렬");
		
		//순차 처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample::print);
		
		System.out.println();
		
		//병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample::print);
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}

//threadPool: thread를 미리 만들어 놓고 사용. Fork Join Pool도 threadPool의 일종. 
//큰 업무를 작은 업무 단위로 쪼개고, 그것을 각기 다른 CPI에서 병렬로 실행한 후 결과를 취합하는 방식.