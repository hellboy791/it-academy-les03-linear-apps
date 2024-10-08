public class FirstDocFourthExercise {
    public static void main(String[] args) {
        //4. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших
        //бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
        int n = 15;
        int m = 19;

        int volumeN = 80;
        int volumeM;
        volumeM = (volumeN/n + 12) * m;
        System.out.println("В " + m + " бидонах " + volumeM + " литров молока!");

    }
}
