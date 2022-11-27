package c1;

public class SortingArrays {

    public static void main(String[] args) {
        int[] numbers = {40, 30, 20, 1, 2, 3, 9, 7, 499, 305};
        Sort();
    }

    public static void Sort() {


        int[] numbers = new int[0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                int temporaryStorage = 0;

                if (numbers[i] > numbers[j]) ;
                temporaryStorage = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temporaryStorage;
            }
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}



