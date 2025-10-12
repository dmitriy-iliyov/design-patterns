package generating;

import com.design.patterns.generating.builder.Truck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {
    @Test
    public void testBuilder() {
        Truck truck = Truck.builder()
                .owner("Owner")
                .driver("Driver")
                .stsNumber("3198 1273")
                .trailer("TrailerX")
                .year(2024)
                .loadCapacity(2000)
                .build();

        assertEquals("Owner", truck.getOwner());
        assertEquals("Driver", truck.getDriver());
        assertEquals("3198 1273", truck.getStsNumber());
        assertEquals("TrailerX", truck.getTrailer());
        assertEquals(2024, truck.getYear());
        assertEquals(2000, truck.getLoadCapacity());
    }
}
