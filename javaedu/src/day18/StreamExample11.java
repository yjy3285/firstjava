package day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample11 {
	public static void main(String[] args) {
		List<Student3> totalList = new ArrayList<>();
		totalList.add(new Student3("홍길동", "남", 92));
		totalList.add(new Student3("김수영", "여", 87));
		totalList.add(new Student3("감자바", "남", 95));
		totalList.add(new Student3("오해영", "여", 93));

		Map<String, List<Student3>> map = totalList.stream().collect(Collectors.groupingBy(s -> s.getGender()));
		System.out.println(map);
		
		List<Student3> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();

		List<Student3> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
	}
}