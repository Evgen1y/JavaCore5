package Module2;

/**
 * Created by bulov on 06.11.2016.
 */
public class HomeWork2_2 {
    public static void main(String[] args) {
        int bal = 100;
        int with = 99;
        int with2 = 10;
        transaction(bal,with);
        transaction(bal,with2);
    }

    static void transaction (double balance, double withdrawal){
        double commission = withdrawal * 0.05;
        balance = balance - withdrawal - commission;
        if (balance>=0)
            System.out.println("OK "+commission+" "+balance);
        else
            System.out.println("NO");


    }
}
