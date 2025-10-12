package behavioral;

import com.design.patterns.behavioral.chain_of_responsibility.BaseHandler;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void test() {
        BaseHandler button1handler = new BaseHandler();
        BaseHandler button2handler = new BaseHandler();
        BaseHandler button3handler = new BaseHandler();
        BaseHandler button4handler = new BaseHandler();

        button1handler.setNext(button2handler);
        button2handler.setNext(button3handler);
        button3handler.setNext(button4handler);
        button1handler.handle("request");
    }
}
