package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_TheNextDay {
	@Test
	public void tc_nextDay(){
		TheNextDay nd = new TheNextDay();
		assertEquals("01-10-2014",nd.nextDay("30-09-2014"));
	}
	@Test
	public void tc_farLongDay(){
		TheNextDay nd = new TheNextDay();
		assertEquals("01-03-1888",nd.nextDay("28-02-1888"));
	}
}
