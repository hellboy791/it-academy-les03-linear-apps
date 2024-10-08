public class SecondDocSecondExercise {
    public static void main(String[] args) {
        double a = 5;
        double b = 7;
        double gip;
        double perimetr;
        double area;
        gip = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
        perimetr = a + b + gip;
        area = (a * b) / 2;
        System.out.println("Периметр прямоугольного треугольника с катетами " + a + " и " + b + " равен " + perimetr);
        System.out.println("Площадь прямоугольного треугольника с катетами " + a + " и " + b + " равен " + area);

    }
}
