package Module4;

/**
 * Created by bulov on 19.11.2016.
 */
public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        switch (getCurrency()){
            case USD: limitOfWithdrawal = 1000;
                break;
            case EUR: limitOfWithdrawal = 1200;
                break;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;

        switch (getCurrency()){
            case USD: limitOfFunding = Integer.MAX_VALUE;
                break;
            case EUR: limitOfFunding = 10000;
                break;
        }
        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        double monthlyRate = 0;

        switch (getCurrency()){
            case USD: monthlyRate = 0.01;
                break;
            case EUR: monthlyRate = 0.02;
                break;
        }
        return monthlyRate;
    }

    @Override
    double getCommission(int summ) {
        double commission = 0;
        switch (getCurrency()){
            case USD:
                if(summ<=1000&&summ>0)
                    commission = 0.05;
                if(summ>1000)
                    commission = 0.07;
                break;
            case EUR:
                if(summ<=1000&&summ>0)
                    commission = 0.06;
                if(summ>1000)
                    commission = 0.08;
                break;
        }
        return commission;
    }

}
