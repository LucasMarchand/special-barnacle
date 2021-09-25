package pucrs.qp.salary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void test500And1230Give68454() {
		double actual = App.calculate_salary(500.00, 1230.00);
		double expected = 684.54;
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void test(){
		double actual = App.calculate_salary(500.00, -1230.00);
		double expected = 684.54;
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testdois(){
		double actual = App.calculate_salary(500, 1230);
		double expected = 684.54;
		assertEquals(expected, actual, 0.1);
	}


	
}
