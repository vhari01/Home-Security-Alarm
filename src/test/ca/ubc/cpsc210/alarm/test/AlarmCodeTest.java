package ca.ubc.cpsc210.alarm.test;

import ca.ubc.cpsc210.alarm.model.AlarmCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit tests for the AlarmCode class
 */
public class AlarmCodeTest {
	private AlarmCode c1;
	private AlarmCode c2;
	private AlarmCode c3;
	private AlarmCode c4;
	
	@BeforeEach
	public void runBefore() {
		c1 = new AlarmCode("1111");
		c2 = new AlarmCode("1111");
		c3 = new AlarmCode("1234");
		c4 = new AlarmCode("twelve");
	}
	
	@Test
	public void testHashCode() {
		assertTrue(c1.hashCode() == c2.hashCode());
		assertFalse(c1.hashCode() == c3.hashCode());
	}

	@Test
	public void testEqualsObject() {
		assertTrue(c1.equals(c1));
		assertTrue(c1.equals(c2));
		assertFalse(c1.equals(c3));
	}

	@Test
	public void testIsValid() {
		assertTrue(c1.isValid());
		assertTrue(c3.isValid());
		assertFalse(c4.isValid());
	}

}
