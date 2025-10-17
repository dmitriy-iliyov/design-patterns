package structural;

import com.design.patterns.structural.composite.Composite;
import com.design.patterns.structural.composite.Element;
import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    public void test() {
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        composite1.addComponent(new Element("name1"));
        composite1.addComponent(new Element("name2"));
        composite1.addComponent(new Element("name3"));
        composite1.addComponent(new Element("name4"));
        composite1.addComponent(new Element("name5"));
        composite1.calcArea();
        composite2.addComponent(new Element("name1"));
        composite2.addComponent(new Element("name2"));
        composite2.addComponent(new Element("name3"));
        composite2.calcArea();
        composite1.addComponent(composite2);
        composite1.calcArea();
    }
}
