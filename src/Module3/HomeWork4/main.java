package Module3.HomeWork4;

/**
 * Created by bulov on 17.11.2016.
 */
public class main {
    public static void main(String[] args) {
        User user = new User("Bulovackiy", 15000, 34, "Google", 3000, "USD");

        System.out.println("Company name length = "+user.companyNameLength());
        System.out.println("Balance = "+user.getBalance());
        user.paySalary();
        System.out.println("Balance = "+user.getBalance());
        user.withdraw(1000);
        System.out.println("Balance = "+user.getBalance());
        user.withdraw(1025);
        System.out.println("Balance = "+user.getBalance());
        System.out.println("Months of employment = "+user.getMonthsOfEmployment());
        user.monthIncreaser(1);
        System.out.println("Months of employment = "+user.getMonthsOfEmployment());
    }


}
