import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(20, 5);
    }

    @Test
    public void canAdd(){
        assertEquals(25, calculator.add(), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(15, calculator.subtract(), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(4, calculator.divide(), 0.01);
    }
}
