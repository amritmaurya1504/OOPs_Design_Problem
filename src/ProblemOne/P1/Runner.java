package ProblemOne.P1;

/*
* Question 1: Geometric Shapes
Create a class hierarchy to represent different geometric shapes, such as Circle, Rectangle, and Triangle.
* Each shape should have properties like area and perimeter, and should implement a common interface Shape
*  with methods to calculate area and perimeter. Demonstrate polymorphism by creating instances of different
*  shapes, calculating their areas and perimeters, and displaying the results.
* */

// POLYMORPHISM + ABSTRACTION

interface Shape{
    double calculateArea();
    double calculatePerimeter();
    void draw();
}

class Circle implements Shape{
    private double radius;

    public Circle(double _radius){
        this.radius = _radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle!");
    }
}

class Rectange implements Shape{
    private int length;
    private int breadth;

    public Rectange(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle!");
    }
}

abstract class RightAngleTrianlge extends Triangle{
    public RightAngleTrianlge(String name){
        super(name);
    }
//    @Override
//    void printName() {
//        System.out.println("I am Right Angled Trianlge! " + getName());
//    }
}

abstract class ScalanTriangle extends Triangle{
    public ScalanTriangle(String name){
        super(name);
    }

//    @Override
//    void printName() {
//        System.out.println("I am Scalan Triangle! " + getName());
//    }
}

public class Runner {
    public static void main(String[] args) {
//        Circle c = new Circle(4);
//        System.out.println(c.calculateArea());
//        System.out.println(c.calculatePerimeter());
//
//        Rectange r = new Rectange(12,24);
//        System.out.println(r.calculateArea());
//        System.out.println(r.calculatePerimeter());
//        RightAngleTrianlge rt = new RightAngleTrianlge("Right Triangle");
//        rt.printName();
//        ScalanTriangle st = new ScalanTriangle("Hey Scalan");
//        st.printName();
//        System.out.println();
    }
}
