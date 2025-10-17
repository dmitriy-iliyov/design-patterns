package behavioral;

import com.design.patterns.behavioral.memento.Editor;
import com.design.patterns.behavioral.memento.History;
import com.design.patterns.behavioral.memento.shapes.Rectangle;
import com.design.patterns.behavioral.memento.shapes.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditorMementoTest {

    @Test
    public void test() {
        Editor editor = new Editor();
        History history = new History(editor);

        editor.addShape(new Rectangle(1, 2, "red"));
        editor.addShape(new Triangle(3, 5, "blue"));
        editor.printShapes();

        history.saveBackup();
        System.out.println("Saving state...");

        editor.addShape(new Triangle(3, 4, "blue"));
        editor.printShapes();

        System.out.println("Restoring state...");
        history.restoreBackup();
        editor.printShapes();
    }

    @Test
    public void testStateRestoration() {
        Editor editor = new Editor();
        History history = new History(editor);

        editor.addShape(new Rectangle(1, 2, "red"));
        editor.addShape(new Triangle(3, 5, "blue"));

        history.saveBackup();

        editor.addShape(new Triangle(3, 4, "green"));
        editor.addShape(new Rectangle(7, 8, "yellow"));

        history.restoreBackup();

        assertEquals(2, editor.getShapeCount());
    }

    @Test
    public void testMultipleSaves() {
        Editor editor = new Editor();
        History history = new History(editor);

        editor.addShape(new Rectangle(1, 2, "red"));
        history.saveBackup();

        editor.addShape(new Triangle(3, 4, "blue"));
        history.saveBackup();

        editor.addShape(new Rectangle(5, 6, "green"));
        assertEquals(3, editor.getShapeCount());

        history.restoreBackup();
        assertEquals(2, editor.getShapeCount());

        history.restoreBackup();
        assertEquals(1, editor.getShapeCount());
    }

    @Test
    public void testEmptyEditorSaveRestore() {
        Editor editor = new Editor();
        History history = new History(editor);

        history.saveBackup();

        editor.addShape(new Rectangle(1, 2, "red"));
        assertEquals(1, editor.getShapeCount());

        history.restoreBackup();

        assertEquals(0, editor.getShapeCount());
    }

    @Test
    public void testShapeContentPreserved() {
        Editor editor = new Editor();
        History history = new History(editor);

        Rectangle rect = new Rectangle(10, 20, "red");
        Triangle tri = new Triangle(5, 15, "blue");

        editor.addShape(rect);
        editor.addShape(tri);

        history.saveBackup();

        editor.delShape(rect);
        editor.addShape(new Rectangle(99, 99, "black"));

        history.restoreBackup();

        assertEquals(2, editor.getShapeCount());
    }

    @Test
    public void testDeleteAndRestore() {
        Editor editor = new Editor();
        History history = new History(editor);

        Rectangle rect = new Rectangle(1, 2, "red");
        editor.addShape(rect);
        editor.addShape(new Triangle(3, 4, "blue"));

        history.saveBackup();

        editor.delShape(rect);
        assertEquals(1, editor.getShapeCount());

        history.restoreBackup();

        assertEquals(2, editor.getShapeCount());
    }

    @Test
    public void testSequentialOperations() {
        Editor editor = new Editor();
        History history = new History(editor);


        editor.addShape(new Rectangle(1, 2, "red"));
        history.saveBackup();

        editor.addShape(new Triangle(3, 4, "blue"));
        history.saveBackup();

        editor.addShape(new Rectangle(5, 6, "green"));
        history.saveBackup();

        editor.addShape(new Triangle(7, 8, "yellow"));

        history.restoreBackup();
        assertEquals(3, editor.getShapeCount());

        history.restoreBackup();
        assertEquals(2, editor.getShapeCount());

        history.restoreBackup();
        assertEquals(1, editor.getShapeCount());
    }
}
