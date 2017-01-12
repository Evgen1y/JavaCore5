package Module10;

/**
 * Created by bulov on 09.01.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        try {
            throw new Exception("Throw Exception");
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Finally block");
        }

        try {
            throw new MyException("Throw My Exception");
        } catch (MyException e){
            System.out.println(e);
        }

        try {
            User u = null;
            u.getBalance();
        } catch (NullPointerException e){
            System.out.println("Your object are null");
        }

        TestMethods t = new TestMethods();
        try{
            t.f();
        } catch (Error e){
            System.out.println(e);
        }

        TestClass testClass = new TestClass();

        try{
            testClass.testMethod(0);
        } catch (RuntimeException e){
            System.out.println(e);
        }

    }
}
