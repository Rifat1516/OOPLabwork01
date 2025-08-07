class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}
class Circle extends Shape {
    private double radius;
    public Circle() {
        super();
        this.radius = 1.0;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }}
class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth();  // Since width == length in Square
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
public class TestShapes {
        public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);
        System.out.println(s1);
        System.out.println(s2);

        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5, "yellow", true);
        System.out.println(c1);
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimeter: " + c2.getPerimeter());
        System.out.println(c2);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.0, 4.0, "red", false);
        System.out.println(r1);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
        System.out.println(r2);

        Square sq1 = new Square();
        Square sq2 = new Square(5.0, "black", true);
        System.out.println(sq1);
        System.out.println("Side: " + sq2.getSide());
        System.out.println("Area: " + sq2.getArea());
        System.out.println("Perimeter: " + sq2.getPerimeter());
        System.out.println(sq2);
    }
}
