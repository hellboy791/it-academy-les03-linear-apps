public class FirstDocSixthExercise {
    public static void main(String[] args) {
        // 6. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        //
        //b + √b
        //2 + 4ac
        //2a
        //− a
        //3
        //c + b
        //−2
        //
        //7.
        double a = 1;
        double b = 2;
        double c = 3;
        double res;

        res = ((b + Math.sqrt((Math.pow(b,2) + 4 * a * c)))/(2*a)) - (Math.pow(a, 3) * c) + (Math.pow(b, -2));
        System.out.println("Ответ: " + res);
    }
}
