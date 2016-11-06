package Module2;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by bulov on 06.11.2016.
 */
public class HomeWork1 {


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
    }

    static int sum(int array[]) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {

            x += array[i];
        }
        return x;
    }

    static double sum(double array[]){
        double x = 0;
        for (int i = 0; i < array.length; i++) {

            x += array[i];
        }
        return x;
    }

    static int min(int array[]) {
        int x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (x > array[i])
                x = array[i];
        }
        return x;
    }

    static double min(double array[]) {
        double x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (x > array[i])
                x = array[i];
        }
        return x;
    }

    static int max(int array[]) {
        int x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (x < array[i])
                x = array[i];
        }
        return x;
    }

    static double max(double array[]) {
        double x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (x < array[i])
                x = array[i];
        }
        return x;
    }

    static int maxPositive(int array[]) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (x < array[i])
                x = array[i];
        }
        return x;
    }

    static double maxPositive(double array[]) {
        double x = 0;
        for (int i = 0; i < array.length; i++) {
            if (x < array[i])
                x = array[i];
        }
        return x;
    }

    static int multiplication(int array[]) {
        int x = 1;
        for (int i = 0; i < array.length; i++) {
            x *= array[i];
        }
        return x;
    }

    static double multiplication(double array[]) {
        double x = 1;
        for (int i = 0; i < array.length; i++) {
            x *= array[i];
        }
        return x;
    }

    static int modulus(int array[]){
        int x = array[0] % array[array.length - 1];
        return x;
    }

    static double modulus(double array[]){
        double x = array[0] % array[array.length - 1];
        return x;
    }



    static int secondLargest(int array[]){
        int x = max(array);
        int k = 0;
        for (int i = 0; i < array.length; i++){
            if (x>array[i]&&array[i]>k) {
                k = array[i];
            }
        }
        return k;
    }

    static double secondLargest(double array[]){
        double x = max(array);
        double k = min(array);
        for (int i = 0; i < array.length; i++){
            if (x>array[i]&&array[i]>k) {
                k = array[i];
            }
        }
        return k;
    }
}


