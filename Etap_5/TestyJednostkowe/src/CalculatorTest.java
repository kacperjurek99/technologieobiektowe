import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void twoPlusTwoShouldEqualFour(){
        var calculator = new Calculator();
        assertTrue(calculator.add(2, 2) == 4);
    }
    @Test
    public void twoMinusTwoShouldEqualZero(){
        var calculator = new Calculator();
        assertTrue(calculator.subtract(2, 2) == 0);
    }
    @Test
    public void twoTimesTwoShouldEqualFour(){
        var calculator = new Calculator();
        assertTrue(calculator.multiply(2, 2) == 4);
    }
    @Test
    public void twoDivideTwoShouldEqualOne(){
        var calculator = new Calculator();
        assertTrue(calculator.divide(2, 2) == 1);
    }
    /*
    @Test
    public void twoPlusTwoShouldEqualFour(){
        var calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }
    @Test
    public void twoMinusTwoShouldEqualZero(){
        var calculator = new Calculator();
        assertEquals(0, calculator.subtract(2, 2));
    }
    @Test
    public void twoTimesTwoShouldEqualFour(){
        var calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
    }
    @Test
    public void twoDivideTwoShouldEqualOne(){
        var calculator = new Calculator();
        assertEquals(1, calculator.divide(2, 2));
    }
    */
}