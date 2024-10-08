public class SecondDocNinthExercise {
    public static void main(String[] args) {
        //9. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

        int length;
        int area;
        int surface;
        double volume;

        length = 9;
        area = length * length;
        surface = area * 6;
        volume = Math.pow(length, 3);
        System.out.println("Площадь грани куба с длиной ребра "  +  length + " равна " + area);
        System.out.println("Площадь полной поверхности куба с длиной ребра " +  length + " равна " + surface);
        System.out.println("Объем куба с длиной ребра " +  length + " равен " + volume);


    }
}
