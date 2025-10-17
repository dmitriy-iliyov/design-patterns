package behavioral;

import com.design.patterns.behavioral.strategy.*;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void test() {
        CollectionWrapper context = new CollectionWrapper(20);

        Sort[] strategies = {
                new BubbleSort(),
                new SelectionSort(),
                new ShellSort(),
                new InserSort()
        };

        for (Sort strategy : strategies) {
            System.out.println(strategy.getClass().getName());

            context.setSort(strategy);
            context.printArray();
            context.sortArray(true);
            context.printArray();
            context.sortArray(false);
            context.printArray();
        }
    }
}
