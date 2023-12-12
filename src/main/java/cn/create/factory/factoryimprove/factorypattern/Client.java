package cn.create.factory.factoryimprove.factorypattern;

/**
 * @Author 原野
 * @DATE 2023/10/17 13:55
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        Square  square = (Square) ShapeFactory.getClass(Square.class);
        square.draw();
        Rectangle  rectangle = (Rectangle) ShapeFactory.getClass(Rectangle.class);
        rectangle.draw();
    }
}
