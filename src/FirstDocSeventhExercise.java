public class FirstDocSeventhExercise {
    public static void main(String[] args) {
        //7. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        //
        //a
        //c
        //∗
        //b
        //d
        //−
        //ab − c
        //cd
        int a = 2;
        int b = 5;
        int c = 7;
        int d = 13;
        double res;

        res = ((a / c) * (b / d)) - ((a * b - c) / c * d);
        System.out.println("Result = " + res);

    }
}
