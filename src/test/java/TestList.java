import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ru.tsu.csd.DList;


public class TestList
{
	private DList list = new DList(24);
	
	@Before
	public void setup()
	{
		list.add(32);
		list.add(43);
	}
	
	@Test
	public void testSum()
	{
		assertEquals(list.size(), 3);
	}
}