package behavioral;

import com.design.patterns.behavioral.observer.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTests {

    @Test
    public void testMultipleObserversReceiveNotifications() {
        Button button = new Button("click");
        TestObserver observer1 = new TestObserver();
        TestObserver observer2 = new TestObserver();

        button.getEventManager().subscribe(button.getEventType(), observer1);
        button.getEventManager().subscribe(button.getEventType(), observer2);

        button.click();

        assertTrue(observer1.wasNotified());
        assertTrue(observer2.wasNotified());
    }

    @Test
    public void testUnsubscribeStopsNotifications() {
        Button button = new Button("click");
        TestObserver observer = new TestObserver();

        button.getEventManager().subscribe(button.getEventType(), observer);
        button.getEventManager().unsubscribe(button.getEventType(), observer);
        button.click();

        assertFalse(observer.wasNotified());
    }

    @Test
    public void testDifferentEventTypesAreIsolated() {
        Button button = new Button("click");
        DoubleClickButton doubleClickButton = new DoubleClickButton("double-click");
        TestObserver clickObserver = new TestObserver();
        TestObserver doubleClickObserver = new TestObserver();

        button.getEventManager().subscribe(button.getEventType(), clickObserver);
        doubleClickButton.getEventManager().subscribe(doubleClickButton.getEventType(), doubleClickObserver);

        button.click();

        assertTrue(clickObserver.wasNotified());
        assertFalse(doubleClickObserver.wasNotified());
    }

    @Test
    public void testMultipleNotificationsToSameObserver() {
        Button button = new Button("click");
        TestObserver observer = new TestObserver();

        button.getEventManager().subscribe(button.getEventType(), observer);

        button.click();
        button.click();
        button.click();

        assertEquals(3, observer.getNotificationCount());
    }

    private static class TestObserver implements EventListener {

        private int count = 0;

        @Override
        public void update() {
            count++;
        }

        boolean wasNotified() {
            return count > 0;
        }

        int getNotificationCount() {
            return count;
        }
    }
}
