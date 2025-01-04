package teachmeskills.lesson8.example1.workDz3;

public class Pramoygol extends Counting {
    double width, height;

    public Pramoygol(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

}
