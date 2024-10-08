public class SecondDocEighthExercise {
    public static void main(String[] args) {

        //8. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих
        //чисел.
        double a = -7;
        double b = 3;
        double ar;
        double module;
        ar = (Math.pow(a, 3) + Math.pow(b, 3))/2;
        System.out.println("Среднее арифметическое чисел " + a + " и " + b + " равно " + ar);
        module = Math.sqrt(Math.abs(a) * Math.abs(b));
        System.out.println("Среднее геометрическое чисел " + a + " и " + b + " равно" + module);

    }
}
