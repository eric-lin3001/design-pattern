package singleFactory;

import singleFactory.product.Circle;
import singleFactory.product.Shape;
import singleFactory.product.Square;
import singleFactory.product.Triangle;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }

        return null;
    }
}
