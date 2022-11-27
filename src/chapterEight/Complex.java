package chapterEight;

public class Complex {

    private double real;
    private double imaginary;


    public Complex(){
        this(0.0, 0.0);
    }

    public Complex(double re, double im){
        this.real = re;
        this.imaginary = im;
    }


    public static Complex add(Complex a, Complex b){
        double re = a.getRealPart()+ b.getRealPart();
        double im = a.getImaginaryPart()+ b.getImaginaryPart();
        return new Complex(re, im);
    }


    public static Complex subtract(Complex a, Complex b){
        double re = a.getRealPart()- b.getRealPart();
        double im = a.getImaginaryPart()- b.getImaginaryPart();
        return new Complex(re, im);
    }


    public void printComplex(){

        System.out.printf("(%.2f, %.2f)%n", this.real, this.imaginary);
    }


    public double getRealPart(){
        return this.real;
    }


    public double getImaginaryPart(){
        return this.imaginary;
    }
}
