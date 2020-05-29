package number;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTest {

	@Test
	public void shouldReturnTrueForPrime() {
		number x = new NumberRunner();
		int result = x.checkPrime(17);
		assertEquals(1, result);
	}
	
	@Test
	public void shouldReturnFalseForNonPrime() {
		number x = new NumberRunner();
		int result = x.checkPrime(20);
		assertEquals(0, result);
	}
	
	@Test
	public void shouldReturnTrueForArmstrong() {
		number x = new NumberRunner();
		boolean result = x.checkAmstrong(153);
		assertEquals(true, result);
	}
	
	@Test
	public void shouldReturnFalseForNonArmstrong() {
		number x = new NumberRunner();
		boolean result = x.checkAmstrong(101);
		assertEquals(false, result);
	}
	
	@Test
	public void shouldReturnFalseForPalindrome() {
		number x = new NumberRunner();
		boolean result = x.CheckPolindrom(121);
		assertEquals(true, result);
	}
	
	@Test
	public void shouldReturnFalseForNonPalindrome() {
		number x = new NumberRunner();
		boolean result = x.checkAmstrong(123);
		assertEquals(false, result);
	}
}
