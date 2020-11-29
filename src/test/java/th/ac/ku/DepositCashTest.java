package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashTest {

    @Test
    void deposit_Less_Than_30000_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 5000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void deposit_Equal_To_30000_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 30000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void deposit_Greater_Than_30000_Result_Should_Be_False(){
        boolean expectedResult = false;
        float depositCash = 300000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);

    }
}
