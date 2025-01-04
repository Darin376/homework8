package teachmeskills.lesson8.example1.workDz3;

public class Ranner {
    public static void main(String[] args) {

        Counting[] figures = new Counting[5];

        figures[0] = new Treygol(3, 4, 5);
        figures[1] = new Pramoygol(5, 10);
        figures[2] = new Krug(7);
        figures[3] = new Treygol(6, 8, 10);
        figures[4] = new Pramoygol(4, 8);


        double totalPerimeter = 0;
        for(Counting figure : figures) {
            totalPerimeter+=figure.calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);

    }
}
