package Module6;

public final class ArrayUtils {

    public static int[] reverse(int[] array){
        int x = array.length-1;
        int[] reverseArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reverseArray[i] = array[x];
            x--;
        }
        return reverseArray;
    }


    public static int[] findEvenElements(int[] array){
        int[] findArrayElements = new int[array.length/2];
        int x = 0;
        for(int i = 1; i < array.length; i++){
            findArrayElements[x] = array[i];
            i++;
            x++;
        }

        return findArrayElements;

    }

    public static int sum(int array[]) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x += array[i];
        }
        return x;
    }

    public static double sum(double array[]){
        double x = 0;
        for (int i = 0; i < array.length; i++) {

            x += array[i];
        }
        return x;
    }

    public static int min(int array[]) {
        int x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (x > array[i])
                x = array[i];
        }
        return x;
    }

    public static double min(double array[]) {
        double x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (x > array[i])
                x = array[i];
        }
        return x;
    }

    public static int max(int array[]) {
        int x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (x < array[i])
                x = array[i];
        }
        return x;
    }

    public static double max(double array[]) {
        double x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (x < array[i])
                x = array[i];
        }
        return x;
    }

    public static int maxPositive(int array[]) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (x < array[i])
                x = array[i];
        }
        return x;
    }

    public static double maxPositive(double array[]) {
        double x = 0;
        for (int i = 0; i < array.length; i++) {
            if (x < array[i])
                x = array[i];
        }
        return x;
    }

    public static int multiplication(int array[]) {
        int x = 1;
        for (int i = 0; i < array.length; i++) {
            x *= array[i];
        }
        return x;
    }

    public static double multiplication(double array[]) {
        double x = 1;
        for (int i = 0; i < array.length; i++) {
            x *= array[i];
        }
        return x;
    }

    public static int modulus(int array[]){
        int x = array[0] % array[array.length - 1];
        return x;
    }

    public static double modulus(double array[]){
        double x = array[0] % array[array.length - 1];
        return x;
    }

    public static int secondLargest(int array[]){
        int x = max(array);
        int k = 0;
        for (int i = 0; i < array.length; i++){
            if (x>array[i]&&array[i]>k) {
                k = array[i];
            }
        }
        return k;
    }

    public static double secondLargest(double array[]){
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
