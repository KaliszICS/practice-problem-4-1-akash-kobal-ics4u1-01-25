public class Rectangle {
    double length;
    double width;
    //Constructor:
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double area() {
        if (length == 0 || width == 0) {
            return 0;
        }
        return this.length * this.width;
    }
    public double perimeter() {
        if (length == 0 || width == 0) {
            return 0;
        }
        return 2 * (this.length + this.width);
    }
}


