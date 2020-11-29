package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDepositTest {
    @Test
    void deposit_Less_Than_The_Minimum_Deposit_Per_Time_Result_Should_Be_False() {
        boolean expectedResult = false;
        Agent agent = new Agent();
        float depositCash = 99.00f;
        String accountType = "Type1";

        boolean actualResult = agent.checkMinimumDepositPerTime(depositCash, accountType);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    void deposit_Equal_To_The_Minimum_Deposit_Per_Time_Result_Should_Be_True() {
        boolean expectedResult = true;
        Agent agent = new Agent();
        float depositCash = 100.00f;
        String accountType = "Type1";

        boolean actualResult = agent.checkMinimumDepositPerTime(depositCash, accountType);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    void deposit_Greater_Than_The_Minimum_Deposit_Per_Time_Result_Should_Be_True() {
        boolean expectedResult = true;
        Agent agent = new Agent();
        float depositCash = 1000.00f;
        String accountType = "Type1";

        boolean actualResult = agent.checkMinimumDepositPerTime(depositCash, accountType);

        assertEquals(actualResult, expectedResult);
    }
}