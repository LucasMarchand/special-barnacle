package pucrs.qp.salary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void test500And1230Give68454() {
		double actual = Main.calculate_salary(500.00, 1230.00);
		double expected = 684.54;
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void testTotalVendidoComValorNegativo(){
		double actual = Main.calculate_salary(500.00, -1230.00);
		double expected = 684.54;
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testSalarioBaseComValorNegativo(){
		double actual = Main.calculate_salary(-500.00, 1230.00);
		double expected = 684.54;
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testVendaZerada(){
		double actual = Main.calculate_salary(700.00, 0.00);
		double expected = 700.00;
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testSalarioBaseComValorDecimal(){
		double actual = Main.calculate_salary(500.86, 1230.00);
		double expected = 685.40;
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testVendaComValorDecimal(){
		double actual = Main.calculate_salary(1700.00, 1230.50);
		double expected = 1884.58;
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testPassandoValoresInteiros(){
		double actual = Main.calculate_salary(500, 1230);
		double expected = 684.54;
		assertEquals(expected, actual, 0.1);
	}
	
}