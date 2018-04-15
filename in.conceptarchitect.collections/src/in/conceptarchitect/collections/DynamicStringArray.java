package in.conceptarchitect.collections;

import java.util.Arrays;

public class DynamicStringArray {

	int factor;
	int length;
	
	String [] array;
	
	public DynamicStringArray(int factor) {
		this.factor=factor;
		array=new String[factor];
	}
	
	private void ensureCapacity() {
		if(length==array.length) {
			array=Arrays.copyOf(array, array.length+factor);
		}
	}
	
	private void validateIndex(int index) {
		if(index<0 || index>=length)
			throw new IndexOutOfBoundsException("Invalid Index "+index);
	}
	
	public void add(String item) {
		ensureCapacity();
		array[length++]=item;
	}
	
	public String get(int pos) {
		validateIndex(pos);
		return array[pos];
	}
	
	public void set(int pos,String value) {
		validateIndex(pos);
		array[pos]=value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder=new StringBuilder("StringArray");
		if(length==array.length)
			builder.append("[\t");
		else
			builder.append("(\t");
		
		for(int i=0;i<array.length;i++) {
			builder.append(array[i]+"\t");
		}
		
		if(length==array.length)
			builder.append("]");
		else
			builder.append(")");
		
		return builder.toString();
		
	}
	
}
