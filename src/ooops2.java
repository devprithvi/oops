/*abstract class Shape {
    Shape(){
        System.out.println(".");
    }
    void draw() {
        System.out.println("Drawing a Shape");
    }
}

 */
interface Shape{
    void draw();
}

class Circle implements Shape { //not object  to Object oriented
   public void draw() {
        System.out.println("Drawing a Circle.");

    }
}

class Rectangle implements Shape {
   public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Polygon implements Shape {
   public void draw() {
        System.out.println("Drawing a Polygon.");
    }
}

public class ooops2 {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();

        s = new Polygon();
        s.draw();

    }
}
