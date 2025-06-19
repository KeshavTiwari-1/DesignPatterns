package org.example.designpatterns.factorypattern;

public class ShapeFactory {
    public Shape getShape(String shape){
        return switch (shape) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> new Circle();
        };
    }
}
