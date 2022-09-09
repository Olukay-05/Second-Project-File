package W3Resource.araysWthree;

public class SumValuesOfAnArray {

    public static void main(String[] args) {

        int[] myArray = {1, 3, 3, 5, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {

            sum+=myArray[i];
        }
        System.out.println(sum);
    }
}
