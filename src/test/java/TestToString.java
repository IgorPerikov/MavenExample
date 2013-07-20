import org.junit.Ignore;
import org.junit.Test;

import ru.tsu.csd.DList;


public class TestToString 
{
	@Ignore
	@Test
	public void test() 
	{
		DList<Integer> list = new DList<Integer>(new Integer(32));
		list.add(32);
		list.add(54);
		System.out.println(list.toString());
	}
}