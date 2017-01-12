package Module10;

/**
 * Created by bulov on 09.01.2017.
 */
public class FirstException extends RuntimeException {
    private String message;

    public FirstException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

