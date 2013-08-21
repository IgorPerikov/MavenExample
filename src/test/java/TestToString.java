import org.junit.Ignore;
import org.junit.Test;

import ru.tsu.csd.DList;


public class TestToString 
{
	@Test
	public void test() 
	{
		DList<Integer> list = new DList<Integer>(new Integer(32));
		list.add(32);
		list.add(54);
		list.add(65);
		list.add(76);
		System.out.println(list.toString());
	}
}