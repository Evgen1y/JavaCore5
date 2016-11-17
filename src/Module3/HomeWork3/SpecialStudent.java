package Module3.HomeWork3;

/**
 * Created by bulov on 12.11.2016.
 */
public class SpecialStudent extends CollegeStudent {
    int secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coersesTaken) {
        super(lastName, coersesTaken);
    }

    public SpecialStudent(int secretKey){
        this.secretKey = secretKey;
    }

    public int getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(int secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
