package Module4;

/**
 * Created by bulov on 19.11.2016.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        switch (getCurrency()){
            case USD: limitOfWithdrawal = 100;
                break;
            case EUR: limitOfWithdrawal = 150;
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
            case EUR: limitOfFunding = 5000;
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
            case EUR: monthlyRate = 0;
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
                    commission = 0.03;
                if(summ>1000)
                    commission = 0.05;
                break;
            case EUR:
                if(summ<=1000&&summ>0)
                    commission = 0.1;
                if(summ>1000)
                    commission = 0.11;
                break;
        }
        return commission;
    }
}
