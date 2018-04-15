package in.conceptarchitect.streams;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Stream;

import in.conceptarchitect.utils.Utils;

public class StreamTest {

	public static void test1() {
		Stream
			.generate(Utils::randomValue)
			.limit(10)
			.forEach(System.out::println);
	}
	
	public static Collector toList() {
		Collector toList=Collector.of(
										() -> new ArrayList(),
										(list,value)->list.add(value),
										(list1,list2)->{ list1.addAll(list2); return list1; },
										result -> result
									);
		
		return toList;
	}
}
