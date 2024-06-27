package day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample13 {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(new Student2("둘리", 10), new Student2("또치", 20), new Student2("도우너", 30));

		// 방법1
		Stream<Student2> studentStream = list.stream();		
		// 중간 처리(학생 객체를 점수로 매핑)
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		// 최종 처리(평균 점수)
		double avg1 = scoreStream.average().getAsDouble();
		System.out.println("평균 점수: " + avg1);

		// 방법2
		double avg2 = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();
		System.out.println("평균 점수: " + avg2);
	}
}