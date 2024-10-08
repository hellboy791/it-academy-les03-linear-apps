public class SecondDocFifthExercise {
    public static void main(String[] args) {
        //5. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
        double r = 14;
        double area;
        double length;

        length = 2 * Math.PI * 2 * r;
        area = Math.PI * Math.pow(r, 2);
        System.out.println("Длина окружности равна " + length);
        System.out.println("Площадь круга равна " + area);

    }
}
