import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class mainTest {

    @Test
    void additionNumber() {
        //given
        int add1 = 1;
        int add2 = 2;
        int expResult = 3;

        //when
        int actual = main.additionNumber(add1, add2);


        //then
        assertEquals(expResult, actual);
    }

    @Test
    void compareNumbers() {
        int num1 = 99;
        int num2 = 99;

        Boolean actual = main.compareNumbers(num1, num2);

        assertFalse(actual);
    }
}