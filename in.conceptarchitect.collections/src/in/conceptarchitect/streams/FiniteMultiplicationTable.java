package in.conceptarchitect.streams;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FiniteMultiplicationTable implements Iterable<Integer>{

	int number;
	int it;
	int max;
	
	public  FiniteMultiplicationTable(int number,int max) {
		this.number=number;
		this.max=10;
		this.it=0;
	}
	
	public FiniteMultiplicationTable(int number) {
		this(number,10);
	}
	

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new TableIterator();
	}
	
	public Stream<Integer> stream() {
		return StreamSupport.stream(this.spliterator(), false);
	}
	
	class TableIterator implements Iterator<Integer>{

		int count=0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return count<max;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			count++;
			return number*count;
		}
		
	}
	
	
}
