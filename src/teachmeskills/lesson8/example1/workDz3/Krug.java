package teachmeskills.lesson8.example1.workDz3;

public class Krug extends Counting {
    double radius;

    public Krug(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
