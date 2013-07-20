import org.junit.Test;

import ru.tsu.csd.DList;


public class TestGeneric 
{
	@Test
	public void test() 
	{
		Double d = new Double(123.32);
		DList<Double> list = new DList<>(d);
		list.add(32.32);
		list.add(54.21);
		Double d1 = list.getFirstNode().getNext().getNext().getValue();
		System.out.println(d1);
	}
}
