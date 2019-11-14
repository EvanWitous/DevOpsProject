import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {

    @Test
    public void TestAddition() {

        Calculator calc = new Calculator();

        int output = calc.Addition(9, 10);

        assertEquals(19, output);
    }

    @Test
    public void TestSubtraction() {

        Calculator calc = new Calculator();

        int output = calc.Subtraction(20, 10);

        assertEquals(10, output);
    }

}
