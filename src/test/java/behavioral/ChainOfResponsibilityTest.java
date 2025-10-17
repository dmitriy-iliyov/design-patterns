package behavioral;

import com.design.patterns.behavioral.chain_of_responsibility.BaseHandler;
import com.design.patterns.behavioral.chain_of_responsibility.Handler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChainOfResponsibilityTest {

    @Test
    public void example() {
        BaseHandler button1handler = new BaseHandler();
        BaseHandler button2handler = new BaseHandler();
        BaseHandler button3handler = new BaseHandler();
        BaseHandler button4handler = new BaseHandler();

        button1handler.setNext(button2handler);
        button2handler.setNext(button3handler);
        button3handler.setNext(button4handler);
        button1handler.handle("request");
    }

    @Test
    public void test() {
        TestHandler handler1 = new TestHandler();
        TestHandler handler2 = new TestHandler();
        handler1.setNext(handler2);

        handler1.handle("request");

        assertTrue(handler1.isHandled());
        assertTrue(handler1.isDelegated());
        assertTrue(handler2.isHandled());
        assertFalse(handler2.isDelegated());
    }

    private final static class TestHandler implements Handler {

        private boolean isHandled;
        private boolean isDelegated;
        private Handler handler;

        @Override
        public void setNext(Handler nextHandler) {
            handler = nextHandler;
        }

        @Override
        public void handle(String request) {
            isHandled = true;
            if (handler != null) {
                handler.handle(request);
                isDelegated = true;
            }
        }

        public boolean isHandled() {
            return isHandled;
        }

        public boolean isDelegated() {
            return isDelegated;
        }
    }
}
