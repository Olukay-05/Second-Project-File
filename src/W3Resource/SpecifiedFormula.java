package W3Resource;

public class SpecifiedFormula {

    public static void main(String[] args) {

        System.out.println(specifiedFormula());

    }

    public static double specifiedFormula(){

        double number1 = 4.0;
        int number2 = 1;
        double number3 = 1.0;
        int number4 = 3;
        int number5 = 5;
        int number6 = 7;
        int number7 = 9;
        int number8 = 11;

        return number1 * (number2 -(number3 / number4) + (number3 / number5) - (number3 / number6) + (number3 / number7) - (number3 /number8));
    }
}
