package W3Resource;

public class AreaAndPerimeterOfACircle {


    public static void main(String[] args) {

        System.out.println("Perimeter is = " + perimeter(3.14, 7.5));
        System.out.println("Area is = " + area(3.14, 7.5));

    }

    public static double perimeter(double pi, double radius){

        return 2 * 3.14 * 7.5;
    }

    public static double area(double pi, double radius){

        return 3.14 * 7.5 * 7.5;
    }
}
