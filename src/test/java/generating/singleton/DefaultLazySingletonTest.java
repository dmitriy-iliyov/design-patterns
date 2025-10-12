package generating.singleton;

import com.design.patterns.generating.singleton.DefaultLazySingleton;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertSame;

public class DefaultLazySingletonTest {

    @Test
    public void twoThreadNonExactlySimultaneouslyAccess_shouldGetSameInstances() throws ExecutionException, InterruptedException {
        Callable<DefaultLazySingleton> task = DefaultLazySingleton::getInstance;

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<DefaultLazySingleton> f1 = executor.submit(task);
        Future<DefaultLazySingleton> f2 = executor.submit(task);

        DefaultLazySingleton instance1 = f1.get();
        DefaultLazySingleton instance2 = f2.get();

        executor.shutdown();

        assertSame(instance1, instance2, "Instances should be the same");
    }

    @Test
    public void twoThreadExactlySimultaneouslyAccess_shouldFailBecauseGetDifferentInstances() throws ExecutionException, InterruptedException {
        for (int i = 0; i < 100; i++) {
            differentInstancesTestPart();
        }
    }

    private void differentInstancesTestPart() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CountDownLatch startSignal = new CountDownLatch(1);

        Future<DefaultLazySingleton> f1 = executor.submit(() -> {
            startSignal.await();
            return DefaultLazySingleton.getInstance();
        });

        Future<DefaultLazySingleton> f2 = executor.submit(() -> {
            startSignal.await();
            return DefaultLazySingleton.getInstance();
        });

        Thread.sleep(100);

        startSignal.countDown();

        DefaultLazySingleton instance1 = f1.get();
        DefaultLazySingleton instance2 = f2.get();

        executor.shutdown();

        assertSame(instance1, instance2, "Instances should be the same");
    }
}
