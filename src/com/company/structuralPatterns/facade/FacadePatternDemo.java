package com.company.structuralPatterns.facade;

public class FacadePatternDemo {

    public static void main(String[] args){
        ShapeMaker maker = new ShapeMaker();
        maker.drawSquare();
        maker.drawCircle();
        maker.drawRectangle();
    }
}
