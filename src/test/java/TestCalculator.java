import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {

    @Test
    public void TestAddition() {

        Calculator calc = new Calculator();

        int output = calc.Addition(9, 10);

        assertEquals(21, output);
    }

    @Test
    public void TestSubtraction() {

        Calculator calc = new Calculator();

        int output = calc.Subtraction(20, 10);

        assertEquals(21, output);
    }

}
