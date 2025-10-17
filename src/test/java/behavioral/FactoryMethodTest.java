package behavioral;

import com.design.patterns.generating.factory_method.BoatCreator;
import com.design.patterns.generating.factory_method.Creator;
import com.design.patterns.generating.factory_method.Transport;
import com.design.patterns.generating.factory_method.TruckCreator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FactoryMethodTest {

    @Test
    public void test() {
        Creator boatCreator = new BoatCreator();
        Creator truckCreator = new TruckCreator();

        boatCreator.createProduct().doSomething();
        truckCreator.createProduct().doSomething();
    }

    @Test
    void testPolymorphismThroughCreator() {
        Creator[] creators = {
                new BoatCreator(),
                new TruckCreator()
        };

        for (Creator creator : creators) {
            Transport transport = creator.createProduct();
            assertNotNull(transport, "Every creator should create transport");
            assertDoesNotThrow(transport::doSomething);
        }
    }
}
