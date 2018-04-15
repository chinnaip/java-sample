package in.conceptarchitect.streams;

import java.util.stream.Stream;

public class MultiplicationTable {

	int number;
	int it;
	int max;
	
	public  MultiplicationTable(int number,int max) {
		this.number=number;
		this.max=10;
		this.it=0;
	}
	
	public MultiplicationTable(int number) {
		this(number,10);
	}
	
	private int nextValue() {
		it++;
		return number*it;
	}
	
	public Stream stream() {
		return Stream
				.generate(this::nextValue)
				.limit(max);				
	}
	
	
}
