package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_triangle {
	@Test
	public void tc_negativeLine(){
		Triangle tamgiac = new Triangle();
		String result = tamgiac.whatIsTriangle(-1, 2, 2);
		assertEquals("not a triangle",result);
	}
	@Test
	public void tc_notTriangle1(){
		Triangle tamgiac = new Triangle();
		String result = tamgiac.whatIsTriangle(1, 1, 2);
		assertEquals("not a triangle",result);
	}
	@Test
	public void tc_notTriangle2(){
		Triangle tamgiac = new Triangle();
		String result = tamgiac.whatIsTriangle(1, 1, 3);
		assertEquals("not a triangle",result);
	}
	@Test
	public void tc_equilateralTriangle(){
		Triangle tamgiac = new Triangle();
		String result = tamgiac.whatIsTriangle(1, 1, 1);
		assertEquals("equilateral triangle",result);
	}
	@Test
	public void tc_balanceTriangle1(){
		Triangle tamgiac = new Triangle();
		String result = tamgiac.whatIsTriangle(1, 1, 1.5);
		assertEquals("balance triangle",result);
	}
	@Test
	public void tc_balanceTriangle2(){
		Triangle tamgiac = new Triangle();
		String result = tamgiac.whatIsTriangle(1.5, 1, 1);
		assertEquals("balance triangle",result);
	}
	@Test
	public void tc_balanceTriangle3(){
		Triangle tamgiac = new Triangle();
		String result = tamgiac.whatIsTriangle(1, 1.5, 1);
		assertEquals("balance triangle",result);
	}
	@Test
	public void tc_balanceRightTriangle(){
		Triangle tamgiac = new Triangle();
		String result = tamgiac.whatIsTriangle(1, 1, Math.sqrt(2));
		assertEquals("balance right triangle",result);
	}
	@Test
	public void tc_randomTriangle(){
		Triangle tamgiac = new Triangle();
		String result = tamgiac.whatIsTriangle(8, 7, 9.2);
		assertEquals("triangle",result);
	}
	
}
