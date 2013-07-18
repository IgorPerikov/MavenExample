import static org.junit.Assert.*;

import org.junit.Test;

import ru.tsu.csd.DList;
import ru.tsu.csd.DListNode;

public class TestTraverse 
{
 
    @Test
    public void testTraversing() 
    {
        DList list = new DList(25);
        list.add(26);
        list.add(27);
        list.add(28);
        list.add(29);
    	System.out.println(list.firstNode.getValue());
    	DListNode nextNode = list.firstNode.getNext();
        while (nextNode.getNext() != null) 
        {
        	System.out.println(nextNode.getValue());
        	nextNode = nextNode.getNext();
        }
        System.out.println(nextNode.getValue());
        assertEquals(list.size(), 5);
        //System.out.println(list.size());
    }
}