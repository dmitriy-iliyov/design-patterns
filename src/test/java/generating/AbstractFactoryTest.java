package generating;

import com.design.patterns.generating.abstract_factory.AbstractFactory;
import com.design.patterns.generating.abstract_factory.CppToolsFactory;
import com.design.patterns.generating.abstract_factory.DevelopmentEnvironment;
import com.design.patterns.generating.abstract_factory.JavaToolsFactory;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void test() {
        AbstractFactory abstractFactory = new JavaToolsFactory();
        DevelopmentEnvironment javaDevelopmentEnvironment = new DevelopmentEnvironment(abstractFactory);
        javaDevelopmentEnvironment.doSomething();

        abstractFactory = new CppToolsFactory();
        DevelopmentEnvironment cppDevelopmentEnvironment = new DevelopmentEnvironment(abstractFactory);
        cppDevelopmentEnvironment.doSomething();
    }
}
