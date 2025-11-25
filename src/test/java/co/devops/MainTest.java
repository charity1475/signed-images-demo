package co.devops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MainTest {

	@Test
	public void testCheckRange() {
		assertEquals("Zero", Main.checkRange(0));
		assertEquals("Low", Main.checkRange(3));
		assertEquals("Medium", Main.checkRange(7));
		assertEquals("High", Main.checkRange(42));
		assertThrows(IllegalArgumentException.class, () -> Main.checkRange(-1));
		assertThrows(IllegalArgumentException.class, () -> Main.checkRange(101));
	}
}
