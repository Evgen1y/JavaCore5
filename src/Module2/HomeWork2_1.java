package Module2;

import static Module6.ArrayUtils.*;

/**

 * Created by bulov on 06.11.2016.

 */

public class HomeWork2_1 {



    public static void main(String[] args) {
        int numbersInt[] = {2, 5, -8, 9, 14, -3, -7, 10, 4, 15};
        double numbersDouble[] = {1.4, 9.5, 8.7, 15.2, 98.3, 25.4, 154.4, 84.2, 95.2, 10.2};



        System.out.println(sum(numbersInt)+"----"+sum(numbersDouble));
        System.out.println(min(numbersInt)+"----"+min(numbersDouble));
        System.out.println(max(numbersInt)+"----"+max(numbersDouble));
        System.out.println(maxPositive(numbersInt)+"----"+maxPositive(numbersDouble));
        System.out.println(multiplication(numbersInt)+"----"+multiplication(numbersDouble));
        System.out.println(modulus(numbersInt)+"----"+modulus(numbersDouble));
        System.out.println(secondLargest(numbersInt)+"----"+secondLargest(numbersDouble));

        System.out.println("\n NEW METHODS \n" );
        
        for(int i:reverse(numbersInt)){
            System.out.print(" "+i);
        }
        System.out.print("\n");
        for(int i:findEvenElements(numbersInt)){
            System.out.print(" "+i);
        }
    }




}