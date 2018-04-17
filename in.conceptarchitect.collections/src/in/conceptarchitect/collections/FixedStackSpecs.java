package in.conceptarchitect.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FixedStackSpecs {
	
	FixedStack stack;
	@Before
	public void init() {
		stack=new FixedStack(2);
	}
	
	@Test
	public void ctor_shouldTakeSizeParameter() {
		FixedStack stack=new FixedStack(5);
	}
	
	
	@Test
	public void push_canPushToAnEmptyStack() {
		FixedStack stack=new FixedStack(2);
		stack.push(1);
	}
	
	@Test
	public void push_canPushToANonFullStack() {
		FixedStack stack=new FixedStack(2);
		stack.push(1);
		stack.push(2); //both should work
	}
	
	@Test(expected=StackOverFlowException.class)
	public void push_throwsStackOverflowExceptionOnAFullStack() {
		FixedStack stack=new FixedStack(2);
		stack.push(1);
		stack.push(2); 
		
		//now pushing should fail
		stack.push(3);
	}
	
	@Test(expected=StackUnderFlowException.class) 
	
	public void pop_throwStackUndeflowExceptionOnAnEmptyStack() {
		FixedStack stack=new FixedStack(2);
		stack.pop();
	}
	
	@Test
	
	public void pop_removesTheItemFromAStack() {
		FixedStack stack=new FixedStack(2);
		stack.push(1);
		stack.push(2);
		int value=stack.pop();
		
		assertEquals(1, stack.size());
		
	}
	
	@Test
	
	 public void pop_removesTheTopMostItemFromTheStack() {
		FixedStack stack=new FixedStack(2);
		stack.push(1);
		stack.push(2);
		
		int item=stack.pop();
		assertEquals(2, item);
		
	}
	
	@Test
	
	  public void isEmpty_returnsTrueForNewStack() {
		FixedStack stack=new FixedStack(2);
		assertTrue(stack.isEmpty());

		
	}
	
	@Test
	
	public void isEmpty_returnsTrueForEmptyStack() {
		FixedStack stack=new FixedStack(2);
		stack.push(1);
		stack.pop();
		assertTrue(stack.isEmpty());
	}
	
	@Test
	
	  public void isEmpty_returnsFalseForNonEmptyStack() {
		FixedStack stack=new FixedStack(2);
		stack.push(1);
		
		assertFalse(stack.isEmpty());
	}

	
	@Test
	
	  public void isFull_returnsFalseForNewStack() {
		
		assertFalse(stack.isFull());
	}
	
	@Test
	
	  public void isFull_returnsFalseForEmptyStack() {
		assumeTrue(stack.isEmpty());
		
		assertFalse(stack.isFull());
	}
	
	@Test
	
	  public void isFull_returnsFalseForNonFullStack() {
		stack.push(1); //no stack is not empty
		assertFalse(stack.isFull());
	}
	
	@Test
	
	  public void isFull_returnsTrueForFullStack() {
		stack.push(1);
		stack.push(2);
		assertTrue(stack.isFull());
	}
	
	
	@Test
	@Ignore
	  public void pop_worksLIFO() {
		throw new RuntimeException("Not yet implemented");
	}
}
