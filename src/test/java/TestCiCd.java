import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestCiCd {
        @Test
        public void testAdd() {
            Calculator calc = new Calculator();
            assertEquals(calc.add(5, 3), 8);
        }

        @Test(expectedExceptions = ArithmeticException.class)
        public void testDivideByZero() {
            Calculator calc = new Calculator();
            calc.divide(5, 0);
        }
}

