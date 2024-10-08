public class FirstDocEighthExercise {
    public static void main(String[] args) {
        //8. Написать программу, которая выводит на экран первые четыре степени числа π.
        int maxSize;
        maxSize = 4;
        for (int i = 1; i<= maxSize; i++){
            System.out.println("Число ПИ в степени " + i + " равно " + Math.pow(Math.PI, i));
        }
    }
}
