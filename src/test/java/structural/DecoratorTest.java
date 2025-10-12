package structural;

import com.design.patterns.structural.decorator.Canvas;
import com.design.patterns.structural.decorator.Circle;
import com.design.patterns.structural.decorator.CircleDecorator;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    private final static int CANVAS_SIZE = 500;

    @Test
    public void test() {
        Canvas canvas = Canvas.getCanvas();
        Circle circle = new Circle(random(),random(),30);
        Circle circle1 = new Circle(random(),random(),20);
        CircleDecorator circleDecorator = new CircleDecorator(circle1);
        canvas.addFigure(circle, circleDecorator);
        canvas.setSize(CANVAS_SIZE, CANVAS_SIZE);
        canvas.setVisible(true);
    }

    public static int random(){
        return (int) (Math.random() * ((CANVAS_SIZE)+1));
    }
}
