public class SecondDocThirdExercise {
    public static void main(String[] args) {
        //3. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
        double x1 = 3;
        double y1 = 3;
        double x2 = 12;
        double y2 = 21;
        double length;

        length = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        System.out.println("Длина отрезка равна " + length);
    }
}
