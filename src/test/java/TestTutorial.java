import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class TestTutorial 
{
	private int a, b, c;
	
	@Before
	public void setup()
	{
		a = 10;
		b = 15;
		c = a + b;
	}
	
	@Ignore
	@Test
	public void testSum()
	{
		assertEquals(c, 25);
	}
}
