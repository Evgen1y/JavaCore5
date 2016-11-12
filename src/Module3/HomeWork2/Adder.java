package Module3.HomeWork2;

/**
 * Created by bulov on 12.11.2016.
 */
public class Adder extends Arithmetic {

    public boolean check (Integer a, Integer b){
        boolean c = false;
        if (a>=b) {
            c = true;
        }
        return c;
    }
}
