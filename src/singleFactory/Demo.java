package singleFactory;

import singleFactory.product.Shape;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // 获取Circle对象，但不使用new方法，即不需要知道具体如何初始化这个对象。
        Shape shape = shapeFactory.getShape("Circle");
        // 调用Circle对象的draw方法。
        shape.draw();
    }
}
