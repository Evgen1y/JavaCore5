package Module3.HomeWork2;

/**
 * Created by bulov on 12.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        Adder adder = new Adder();
        System.out.println(adder.add(a,b)+" "+ adder.check(a,b));
    }

}
