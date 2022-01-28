package assignment2_OOP;

abstract class Shape {
    public abstract void draw();

    public static void main(String[] args) {
        Rectangle R1 =new Rectangle();
        R1.draw();

        Cube C1 = new Cube();
        C1.draw();

        Line L1 = new Line();
        L1.draw();
    }
}
class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
class Line extends Shape{

    @Override
    public void draw() {
        System.out.println("Draw Line");
    }
}
class Cube extends Shape{

    @Override
    public void draw() {
        System.out.println("Draw Cube");
    }
}