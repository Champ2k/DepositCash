package th.ac.ku;

import java.util.Arrays;

public class Agent {

    private float limitDepositPerTimes = 30000.00f;
    private float limitDepositPerDays = 50000.00f;
    private String[] validAccountList = {"7563956391", "365916394"};

    public boolean checkDepositPerTransaction(float depositCash) {
        return depositCash <= this.limitDepositPerTimes;
    }

    public boolean checkMaximumDepositCashPerDay(float depositCash) {
        return depositCash <= this.limitDepositPerDays;
    }

    public  boolean checkSuspendedAccount(String accountNumber){
        return Arrays.stream(this.validAccountList).anyMatch(accountNumber::equals);
    }

    public boolean checkMinimumDepositPerTime(float depositCash, String accountType){
        return depositCash >= getMinimumDepositPerTransactionLimit(accountType);
    }

    private float getMinimumDepositPerTransactionLimit(String accountType) {
        return 100.00f;
    }
}
