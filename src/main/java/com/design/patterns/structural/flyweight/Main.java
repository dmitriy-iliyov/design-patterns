package com.design.patterns.structural.flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    private final static int CANVAS_SIZE = 500;
    private final static int FIGURES_COUNT = 10000;

    @Override
    public void start(Stage primaryStage) {
        CanvasFX canvas = new CanvasFX(CANVAS_SIZE, CANVAS_SIZE);
        for (int i = 0; i < Math.floor((double) FIGURES_COUNT / 4); i++) {
            canvas.addFigure("RED", random(), random(), random(), random());
            canvas.addFigure("BLUE", random(), random(), random(), random());
            canvas.addFigure("GREEN", random(), random(), random(), random());
            canvas.addFigure("GREEN", random(), random(), random(), random());
        }

        canvas.drawAll();

        Pane root = new Pane(canvas);
        Scene scene = new Scene(root, CANVAS_SIZE, CANVAS_SIZE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Canvas Example");
        primaryStage.show();
    }

    public static int random() {
        return (int) (Math.random() * (CANVAS_SIZE + 1));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
