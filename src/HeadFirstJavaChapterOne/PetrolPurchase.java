package HeadFirstJavaChapterOne;

public class PetrolPurchase {

    private String location;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    private double netPurchasedAmount;


    public PetrolPurchase(){

    }

    public PetrolPurchase(String location, String typeOfPetrol, int quantity, double pricePerLitre, double discount){

        this.location = location;
        this.typeOfPetrol = typeOfPetrol;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        percentageDiscount = discount;
    }

    public void setLocation(String location){

        this.location = location;
    }

    public String getLocation(){

        return location;
    }

    public void setTypeOfPetrol(String typeOfPetrol){
        this.typeOfPetrol =typeOfPetrol;
    }

    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }

    public void setQuantity(){

        this.quantity = quantity;
    }

    public int getQuantity(){

        return quantity;
    }

    public void setPricePerLitre(double pricePerLitre) {

        this.pricePerLitre = pricePerLitre;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchasedAmount(){

        return quantity * pricePerLitre;
    }


    public double netAmount(){
        return getPurchasedAmount();
    }










}


