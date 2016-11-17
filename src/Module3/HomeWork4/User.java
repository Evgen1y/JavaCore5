package Module3.HomeWork4;

/**
 * Created by bulov on 17.11.2016.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary(){
        balance += salary;
    }

    public void withdraw(int summ){
        if (summ<=1000&&summ>0){
            balance -= (summ + (summ*0.05));
            System.out.println("commission is 5%");
        }
        if (summ>1000){
            balance -= (summ + (summ*0.1));
            System.out.println("commission is 10%");
        }
        if (summ<0)
            System.out.println("summ is less then 0");

    }

    public int companyNameLength(){
        int length = companyName.length();
        return length;
    }

    public void monthIncreaser(int addMonth){
        monthsOfEmployment += addMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String compsnyName) {
        this.companyName = compsnyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
