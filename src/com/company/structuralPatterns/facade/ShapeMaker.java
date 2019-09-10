package com.company.structuralPatterns.facade;

public class ShapeMaker {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        this.circle.draw();
    }

    public void drawRectangle() {
        this.rectangle.draw();
    }

    public void drawSquare() {
        this.square.draw();
    }


}
