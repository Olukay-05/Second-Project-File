package ChapterFour;

public class HeartRates {

    private String firstName;
    private String lastName;
    private int dateOfBirthYear;
    private int dateOfBirthMonth;
    private int dateOfBirthDay;
    private int currentYear;


    public HeartRates() {
    }

    public HeartRates(String firstName, String lastName, int dateOfBirthDay, int dateOfBirthMonth, int dateOfBirthYear, int currentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirthDay = dateOfBirthDay;
        this.dateOfBirthMonth = dateOfBirthMonth;
        this.dateOfBirthYear = dateOfBirthYear;

        this.currentYear = currentYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

//        System.out.println("James");

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public void setDateOfBirthYear(int dateOfBirthYear) {
        this.dateOfBirthYear = dateOfBirthYear;
    }

    public int getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public void setDateOfBirthMonth(int dateOfBirthMonth) {
        this.dateOfBirthMonth = dateOfBirthMonth;
    }

    public int getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(int dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }


    public int getAge(){

        return currentYear - dateOfBirthYear;
    }

    public double getMaximumHeartRate(){

        //220 minus your age in years

        int beatsPerMinutes = 220;
        return beatsPerMinutes - getAge();

    }

    public double getTargetHeartRate(double highestRange, double lowestRange){

        //50–85% of your maximum heart rate

        return (highestRange - lowestRange) / 100;
    }

}