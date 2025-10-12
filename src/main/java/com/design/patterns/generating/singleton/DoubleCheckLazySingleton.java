package com.design.patterns.generating.singleton;

/**
 * Until Java 5 this implementation was not thread-safe due to the JVM object initialization process:
 * <ol>
 *     <li>Allocate memory for the object</li>
 *     <li>Initialize the object (constructor runs)</li>
 *     <li>Assign the reference to the INSTANCE variable</li>
 * </ol>
 *
 * Because of possible instruction reordering, step 3 could occur before step 2,
 * causing another thread to observe a partially constructed object.
 * <p>
 * Since Java 5, using the <code>volatile</code> keyword makes this implementation thread-safe
 * due to the improved JMM guarantees.
 */
public class DoubleCheckLazySingleton {

    private static volatile DoubleCheckLazySingleton INSTANCE;

    private DoubleCheckLazySingleton() {}

    public static DoubleCheckLazySingleton getInstance() {
        DoubleCheckLazySingleton result = INSTANCE;
        if (result != null) {
            return result;
        }
        synchronized(DoubleCheckLazySingleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new DoubleCheckLazySingleton();
            }
            return INSTANCE;
        }
    }
}
