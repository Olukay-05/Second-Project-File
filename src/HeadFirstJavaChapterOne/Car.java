package HeadFirstJavaChapterOne;

public class Car {

    private String model;
    private String year;
    private double price;

    public Car(String model){

    }

    public Car (String model, String year, double price){

        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model){

        this.model = model;
    }

    public String getModel(){

        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        }
    }
    public double getPrice() {
        return price;
    }

    public double carDiscount(){

        int discountRate = 5;

        return getPrice() - (getPrice() * discountRate / 100);
    }

    public double carDiscount2(){

        int discountRate = 7;

        return getPrice() - (getPrice() * discountRate / 100);
    }




}
