package Module10;

/**
 * Created by bulov on 09.01.2017.
 */
public class SecondException extends Error {
    private String message;

    public SecondException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
