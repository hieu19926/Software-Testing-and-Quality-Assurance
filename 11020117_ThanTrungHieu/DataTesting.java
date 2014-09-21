package test;
import static org.junit.Assert.*;

import org.hamcrest.core.SubstringMatcher;
import org.junit.Test;


public class DataTesting {
	@Test
	public void testData(){
		MainTest test = new MainTest();
		String result = test.calc(0, 1, 1);
		assertEquals("Syntax error.", result);
	}
	@Test
	public void testNoResult(){
		MainTest test = new MainTest();
		String result = test.calc(1, 1, 1);
		assertEquals("Not have result.", result);
	}
	@Test
	public void testTrueResult(){
		MainTest test = new MainTest();
		String result = test.calc(1, -2, 1);
		System.out.print(result);
		assertEquals("a = b = 1.0", result);
	}
}
