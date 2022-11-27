package chapterEight;

public class TestComplex {

    public static void main(String[] args){


        Complex a = new Complex(2.0, 2.5);
        Complex b = new Complex(3.0, 2.5);
        Complex c = Complex.add(a, b);
        Complex d = Complex.subtract(a, b);
        System.out.print("a = ");
        a.printComplex();
        System.out.print("b = ");
        b.printComplex();
        System.out.print("c = ");
        c.printComplex();
        System.out.print("d = ");
        d.printComplex();
    }
}
