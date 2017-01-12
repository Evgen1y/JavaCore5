package Module10;

/**
 * Created by bulov on 09.01.2017.
 */
public class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message=message;
    }

    @Override
    public String toString() {
        return message;
    }
}
