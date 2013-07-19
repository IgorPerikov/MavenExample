import static org.junit.Assert.*;

import org.junit.Test;

import ru.tsu.csd.DList;
import ru.tsu.csd.DListNode;

public class TestTraverse 
{
 
    @Test
    public void testTraversing() 
    {
        int a = 25;
    	DList list = new DList(a);
        for (int i = 0; i < 3; i++)
        {
        	list.add(a + i);
        }
        System.out.println(list.getFirstNode().getValue());
    	DListNode nextNode = list.getFirstNode().getNext();
        while (nextNode.getNext() != null) 
        {
        	System.out.println(nextNode.getValue());
        	nextNode = nextNode.getNext();
        }
        System.out.println(nextNode.getValue());
        assertEquals(list.size(), 4);
    }
}