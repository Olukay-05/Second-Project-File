package HeadFirstJavaChapterOne;

public class Account {
    private String name;
    private double myBalance;

    public Account(String name, double balance){
        this.name = name;
        myBalance = balance;

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getBalance() {
        return myBalance;
    }
}
