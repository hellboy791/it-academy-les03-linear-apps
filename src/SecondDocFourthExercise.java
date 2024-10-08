public class SecondDocFourthExercise {
    public static void main(String[] args) {
        //4. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
        double x1 = 3;
        double y1 = 3;
        double x2 = 12;
        double y2 = 21;
        double x3 = 14;
        double y3 = 10;
        double area;
        double perimetr;
        double a;
        double b;
        double c;

        area = Math.abs(((x1 - x3) * (y2 - y3) - (y1 - y3) * (x2 - x3)) / 2);
        System.out.println("Площадь треугольника равна " + area);
        a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        perimetr = a + b + c;
        System.out.println("Периметр треугольника равен " + perimetr);

    }
}
