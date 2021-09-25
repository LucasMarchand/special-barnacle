package pucrs.qp.salary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pucrs.qp.salary.P1009;

public class P1009Test {

	@Test
	public void test500And1230Give68454() {
		double actual = P1009.calculate_salary(500.00, 1230.00);
		double expected = 684.54;
		assertEquals(expected, actual, 0.01);
	}
	
}
