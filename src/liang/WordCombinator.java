package liang;

import java.util.Scanner;
import java.util.Set;

public class WordCombinator {

//    public static Set<String> generateThreeLetterCharacterCombinations(String word){
//        return  null;
//    }


    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a five-letter word:  ");

        String[] list = sc.nextLine().split("");

        System.out.println("The three-letter words generated are:");

        for(int i =0; i <5; i++){

            for(int j =0; j <5; j++){

                if(i == j)
                    continue;
                for(int k =0; k <5; k++){
                    if(j == k)
                        continue;

                    System.out.println(list[i]+ list[j]+ list[k]);
                }
            }
        }
    }
}
