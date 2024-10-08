public class SecondDocTenthExercise {
    public static void main(String[] args) {
        //10. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы
        //вписанной и описанной окружностей.

        double x = 4;
        double area;
        double height;
        double radiusIn;
        double radiusOut;
        area = Math.pow(x, 2) * Math.sqrt(3) / 4;
        height = x * Math.sqrt(3) / 2;
        radiusIn = x / 2 * Math.sqrt(3);
        radiusOut = x / Math.sqrt(3);
        System.out.println("Площадь треугольника " + area);
        System.out.println("Высота треугольника " + height);
        System.out.println("Радиус вписанной окружности " + radiusIn);
        System.out.println("Радиус описанной описанной окружности " + radiusOut);
    }
}
