package behavioral;

import com.design.patterns.behavioral.iterator.IntCollection;
import com.design.patterns.behavioral.iterator.Iterator;
import com.design.patterns.behavioral.iterator.OrderedIntCollection;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    public void test() {
        IntCollection intCollection = new IntCollection();
        Iterator iterator = intCollection.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getNext());
        }
        OrderedIntCollection orderedIntCollection = new OrderedIntCollection();
        Iterator orderedIterator = orderedIntCollection.getIterator();
        while (orderedIterator.hasNext()){
            System.out.println(orderedIterator.getNext());
        }
    }
}
