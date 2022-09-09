package HeadFirstJavaChapterOne;

public class ExerciseOne {

    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the Loop");
            while (x < 4){
                System.out.println("In the loop");
                System.out.println("Value of x is " + x);
                    x = x + 1;
            }

        System.out.println("This is after the loop");

        DooBoo();
        Shuffle1();
  //      BeerNum();
    }

    public static void DooBoo(){

        int x = 1;

        while (x < 3){

            System.out.print("Doo");
            System.out.print("Bee");
                x = x+1;
        }

        if(x == 3){
            System.out.println("Do");
        }

    }

/*    public static void BeerNum(){
        int beerNum = 99;
        String word = "bottles";

        for (int i = 1; i < 99; i++) {
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");

            beerNum = beerNum - 1;
        }

        System.out.println("No more bottles of beer on the wall");
    }

 */

    public static void Shuffle1(){
        int x = 3;

        while (x > 0){
            if (x > 2){
                System.out.print("a");
                x = x - 1;
            }
            System.out.print("-");
            if (x == 2){
                System.out.print("b c");
            }
            if (x == 1){
                System.out.print("d");
            }
            x = x - 1;
        }
    }
}
