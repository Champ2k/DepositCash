package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuspendedAccountTest {

    @Test
    void check_The_Valid_User_Account_Result_Should_Be_True(){
        boolean expectedResult = true;
        Agent agent = new Agent();
        String accountNumber = "7563956391";

        boolean actualResult = agent.checkSuspendedAccount(accountNumber);

        assertEquals(actualResult,expectedResult);
    }

    @Test
    void check_The_Invalid_User_Account_Result_Should_Be_False(){
        boolean expectedResult = false;
        Agent agent = new Agent();
        String accountNumber = "938451097";

        boolean actualResult = agent.checkSuspendedAccount(accountNumber);

        assertEquals(actualResult,expectedResult);
    }
}
