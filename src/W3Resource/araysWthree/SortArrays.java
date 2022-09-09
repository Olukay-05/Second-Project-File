package W3Resource.araysWthree;

import java.util.Arrays;

public class SortArrays {

    public static void main(String[] args) {

        arrayOfNumbers();
        arrayOfStrings();
    }

    public static void arrayOfNumbers(){

        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Original numeric array: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println();
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));
        System.out.println("**********************");
    }

    public static void arrayOfStrings(){

        String[] myStrings = {"Java", "Python", "C", "C Programming", "C++", "C#"};

        System.out.println("Original string array : " + Arrays.toString(myStrings));
        Arrays.sort(myStrings);
        System.out.println("Sorted string arrays :" + Arrays.toString(myStrings));
    }

}
