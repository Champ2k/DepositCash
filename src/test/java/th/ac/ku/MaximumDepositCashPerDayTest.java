package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepositCashPerDayTest {

    @Test
    void deposit_Less_Than_The_Maximum_In_A_Day_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 5000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaximumDepositCashPerDay(depositCash);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void deposit_Equal_To_The_Maximum_In_A_Day_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 50000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaximumDepositCashPerDay(depositCash);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void deposit_Greater_Than_The_Maximum_In_A_Day_Result_Should_Be_False(){
        boolean expectedResult = false;
        float depositCash = 600000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaximumDepositCashPerDay(depositCash);

        assertEquals(expectedResult, actualResult);

    }
}
