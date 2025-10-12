package generating.singleton;

import com.design.patterns.generating.singleton.DoubleCheckLazySingleton;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertSame;

public class DoubleCheckLazySingletonTest {

    @Test
    public void twoThreadExactlySimultaneouslyAccess_shouldGetSameInstances() throws ExecutionException, InterruptedException {
        for (int i = 0; i < 100; i++) {
            differentInstancesTestPart();
        }
    }

    private void differentInstancesTestPart() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CountDownLatch startSignal = new CountDownLatch(1);

        Future<DoubleCheckLazySingleton> f1 = executor.submit(() -> {
            startSignal.await();
            return DoubleCheckLazySingleton.getInstance();
        });

        Future<DoubleCheckLazySingleton> f2 = executor.submit(() -> {
            startSignal.await();
            return DoubleCheckLazySingleton.getInstance();
        });

        Thread.sleep(100);

        startSignal.countDown();

        DoubleCheckLazySingleton instance1 = f1.get();
        DoubleCheckLazySingleton instance2 = f2.get();

        executor.shutdown();

        assertSame(instance1, instance2, "Instances should be the same");
    }
}
