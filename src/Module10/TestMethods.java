package Module10;

/**
 * Created by bulov on 09.01.2017.
 */
public class TestMethods {
    public void f(){
        try{
            g();
        } catch (RuntimeException e) {
            throw new Error("Error in void f()");
        }
    }

    public void g(){
        throw new RuntimeException("RuntimeException in void g()");
    }
}
