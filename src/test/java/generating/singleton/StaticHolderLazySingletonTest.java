package generating.singleton;

import com.design.patterns.generating.singleton.StaticHolderLazySingleton;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertSame;

public class StaticHolderLazySingletonTest {

    @Test
    public void twoThreadExactlySimultaneouslyAccess_shouldGetSameInstances() throws ExecutionException, InterruptedException {
        for (int i = 0; i < 100; i++) {
            differentInstancesTestPart();
        }
    }

    private void differentInstancesTestPart() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CountDownLatch startSignal = new CountDownLatch(1);

        Future<StaticHolderLazySingleton> f1 = executor.submit(() -> {
            startSignal.await();
            return StaticHolderLazySingleton.getInstance();
        });

        Future<StaticHolderLazySingleton> f2 = executor.submit(() -> {
            startSignal.await();
            return StaticHolderLazySingleton.getInstance();
        });

        Thread.sleep(100);

        startSignal.countDown();

        StaticHolderLazySingleton instance1 = f1.get();
        StaticHolderLazySingleton instance2 = f2.get();

        executor.shutdown();

        assertSame(instance1, instance2, "Instances should be the same");
    }
}
