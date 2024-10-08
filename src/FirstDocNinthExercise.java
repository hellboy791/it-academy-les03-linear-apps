public class FirstDocNinthExercise {
    public static void main(String[] args) {
        //9. Найти произведение цифр заданного четырехзначного числа.
        int number = 43212322;
        int prevNum ;
        int x = 1;
        prevNum = 1;
        for (int i = number; i>0; i = i / 10) {
            prevNum = i % 10;
            x = x * prevNum;
        }
        System.out.println("Произведение цифр числа " + number + " равно " + x);
    }
}
