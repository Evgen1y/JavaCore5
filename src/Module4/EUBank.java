package Module4;

/**
 * Created by bulov on 19.11.2016.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        switch (getCurrency()){
            case USD: limitOfWithdrawal = 2000;
                break;
            case EUR: limitOfWithdrawal = 2200;
                break;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;

        switch (getCurrency()){
            case USD: limitOfFunding = 10000;
                break;
            case EUR: limitOfFunding = 20000;
                break;
        }
        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        double monthlyRate = 0;

        switch (getCurrency()){
            case USD: monthlyRate = 0;
                break;
            case EUR: monthlyRate = 0.01;
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
                    commission = 0.02;
                if(summ>1000)
                    commission = 0.04;
                break;
        }
        return commission;
    }
}
