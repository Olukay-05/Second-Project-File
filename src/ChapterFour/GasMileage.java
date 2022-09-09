package ChapterFour;

import java.util.Scanner;

public class GasMileage {

    int milesDriven;
    int numberOfTrips;
    int gallonsUsed;

    int totalGallonForEachTankful;

    public GasMileage(){}

    public GasMileage(int milesDriven, int numberOfTrips, int gallonsUsed, int totalGallonForEachTankful){

        this.milesDriven = milesDriven;
        this.numberOfTrips = numberOfTrips;
        this.gallonsUsed = gallonsUsed;
        this. totalGallonForEachTankful = totalGallonForEachTankful;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public int getNumberOfTrips() {
        return numberOfTrips;
    }

    public int getGallonsUsed() {



        return gallonsUsed;
    }

    public void setGallonsUsed(int gallonsUsed){

        this.gallonsUsed = gallonsUsed;


    }


//    public void  setTotalGallonForEachTankful(int numberOfGallonsPerTankful){
//
//        this.totalGallonForEachTankful = numberOfGallonsPerTankful;
//    }

    public int calculateMilesPerGallon(){

        return getGallonsUsed() / getMilesDriven();

    }


    public int calculateTotalMilesPerGallon() {


        return getGallonsUsed() * getMilesDriven();
    }

}
