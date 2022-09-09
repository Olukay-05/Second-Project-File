package W3Resource.araysWthree;

public class AverageValueOfElements {

    public static void main(String[] args) {

        average();

        int[] myArray = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};

        System.out.println(arrayCheck(myArray, 1456));
        System.out.println(arrayCheck(myArray, 1400));

    }

    public static void average(){

        int [] myArray = {3, 4, 5, 7, 9};

        double sum = 0;
        double average = 0;

        for (int i = 0; i < myArray.length; i++) {

            sum+=myArray[i];
        }
        average = sum/ myArray.length;
        System.out.println(average);
    }

    public static boolean arrayCheck(int[]arr, int item){

        for (int i = 0; i < arr.length; i++) {

            if (item == arr[i]){
                return true;
            }
        }
        return false;
    }

//    public static void checkArrayIndex(){
//
//        int []myArray = {25, 14, 56, 15, 36};
//        int temp = 0;
//
//        if (myArray == null)
//            return -1;
//        int length = myArray.length;
//        int i = 0;
//        while (i < length){
//
//
//        }
//
//    }
}
