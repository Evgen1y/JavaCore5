package Module10;

/**
 * Created by bulov on 09.01.2017.
 */
public class ThirdException extends RuntimeException {
    String message;

    public ThirdException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
