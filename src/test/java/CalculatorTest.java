import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void additionTest() {
        int result = calculator.addition(3, 2);
        assertEquals(5, result);
    }
}
