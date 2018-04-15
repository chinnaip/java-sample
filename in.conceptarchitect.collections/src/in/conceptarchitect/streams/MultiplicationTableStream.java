package in.conceptarchitect.streams;

import java.util.Spliterators;
import java.util.function.IntConsumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MultiplicationTableStream extends Spliterators.AbstractIntSpliterator{

	int max;
	int number;
	int count;
	
	public  MultiplicationTableStream(int number) {
		// TODO Auto-generated constructor stub
		super(Long.MAX_VALUE,0);
		this.number=number;
		this.count=0;
		this.max=10;
	}
	
	@Override
	public boolean tryAdvance(IntConsumer arg0) {
		// TODO Auto-generated method stub
		count++;
		if(count<=max)
			arg0.accept(count*number);
		return count<=max;
	}
	
	public Stream<Integer> stream() {
		return StreamSupport.stream(this, false);
	}

}
