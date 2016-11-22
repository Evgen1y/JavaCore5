package Module4;


public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        double balance = user.getBalance();
        Bank userBank = user.getBank();
        int limit = userBank.getLimitOfWithdrawal();
        double commission = userBank.getCommission(amount);

        System.out.println("\n-------------- Withdraw of user ---------------");

        if (balance >= (amount + (amount * commission))) {
            if (limit >= amount) {
                balance -= (amount + (amount * commission));
                user.setBalance(balance);
                System.out.println(user.getName() + " withdraw " + amount + " with commission " + (amount * commission) + "(" + (commission * 100) + "%)\nBalance = " + balance + "\n");
            } else {
                System.out.println("Limit up");
            }
        } else {
                System.out.println("On "+user.getName()+" balance not enough money!");
            }
            System.out.println("-----------------------------------------------\n");
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        double balance = user.getBalance();
        int limit = userBank.getLimitOfFunding();

        System.out.println("\n------------------ Fund User ------------------");

        if(limit>=amount) {
            balance += amount;
            user.setBalance(balance);
            System.out.println(user.getName() + " replenishment bank account " + amount + " " + userBank.getCurrency() + "\nBalance = " + balance + " " + userBank.getCurrency());
        }else{
            System.out.println("Limit up");
        }

            System.out.println("-----------------------------------------------\n");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount){
        double balanceFrom = fromUser.getBalance();
        double balanceTo = toUser.getBalance();
        Bank bankFrom = fromUser.getBank();
        Bank bankTo = toUser.getBank();
        double commission = bankFrom.getCommission(amount);

        System.out.println("\n------------- Transfer Money ------------------");


        System.out.println(fromUser.getName()+" balance = "+balanceFrom+" "+bankFrom.getCurrency()+"\n"
                +toUser.getName()+" balance = "+balanceTo+" "+bankTo.getCurrency());

        if(balanceFrom > amount) {
            balanceFrom -= (amount + (amount * commission));
            fromUser.setBalance(balanceFrom);

            System.out.println(fromUser.getName() + " withdraw " + amount + " " + bankFrom.getCurrency()
                    + ". Commission = " + (amount * commission) + "(" + (commission * 100) + "%)");

            balanceTo += amount;
            toUser.setBalance(balanceTo);

            System.out.println(toUser.getName() + " replenishment " + amount + " " + bankTo.getCurrency());

            System.out.println(fromUser.getName() + " balance = " + balanceFrom + " " + bankFrom.getCurrency() + "\n"
                    + toUser.getName() + " balance = " + balanceTo + " " + bankTo.getCurrency());
        }else{
            System.out.println("Not enough money in "+fromUser.getName()+" balance for transfer!");
        }

        System.out.println("-----------------------------------------------\n");
    }

    @Override
    public void paySalary(User user) {
        int salary = user.getSalary();
        Bank bank = user.getBank();
        double balance = user.getBalance();
        System.out.println("\n--------------- Pay Salary --------------------");

        balance += salary;
        user.setBalance(balance);
        System.out.println("Transferred salary for "+user.getName()+" "+salary+" "+bank.getCurrency()+"\nBalance = "+balance+" "+bank.getCurrency());
        System.out.println("-----------------------------------------------\n");
    }
}
