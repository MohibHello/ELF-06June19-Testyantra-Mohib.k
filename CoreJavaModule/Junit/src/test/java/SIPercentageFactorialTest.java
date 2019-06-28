import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.testyantra.java.assessment.SIPercentageFactorial;

public class SIPercentageFactorialTest {

	private static SIPercentageFactorial sp = new SIPercentageFactorial();

	@Test
	public void testSI() {
		assertEquals((double) 1000, sp.simpleInterest(10000, 2, 5), 0.01);
	}

	@Test
	public void testFactorial() {
		assertEquals(120, sp.factorial(5));
	}

	@Test
	public void testPercentage() {

		double actual = sp.percentageOfThreeSubject(56, 78, 66, 300);
		double expected = 66.0;

		assertEquals(expected, actual, 0.01);
	}

}
