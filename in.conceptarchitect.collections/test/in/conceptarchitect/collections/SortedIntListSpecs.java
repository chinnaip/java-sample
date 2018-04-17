package in.conceptarchitect.collections;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SortedIntListSpecs {
	
	SortedIntList list;
	
	@Before
	public void init() {
		list=new SortedIntList();
		list.add(5);
		list.add(10);
		list.add(15);
	}

	@Test
	public void add_lowestValueIsAddedAtTheBegining() {
		list.add(1);
		assertEquals(1, list.get(0));
		
	}
	
	@Test
	public void add_highestValueIsAddedAtTheEnd() {
		list.add(100);
		assertEquals(100, list.get(-1));
	}
	
	@Test
	public void add_midValueIsAddedInRightPlace() {
		list.add(8);
		assertEquals(8, list.get(1));
	}
	
	
	@Test
	@Ignore
	public void add_allValuesAreSorted() {
		
	}
	
	
	
	

}
