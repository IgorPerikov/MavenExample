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
        while (list.firstNode.getNext() != null) 
        {
            DListNode next = list.firstNode.getNext();
            System.out.println(next.getValue());
        }
    }
}