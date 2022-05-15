import org.testng.annotations.Test;
import org.testng.Assert;

public class CalculatorTest {
        @Test
        public void twoPlusTwoShouldEqualFour () {
        var calculator = new Calculator();
        assert (calculator.add(2, 2) == 4);
    }
        @Test
        public void twoMinusTwoShouldEqualZero() {
        var calculator = new Calculator();
        assert (calculator.subtract(2, 2) == 0);
    }
        @Test
        public void twoTimesTwoShouldEqualFour () {
        var calculator = new Calculator();
        assert (calculator.multiply(2, 2) == 4);
    }
        @Test
        public void twoDivideTwoShouldEqualOne () {
        var calculator = new Calculator();
        assert (calculator.divide(2, 2) == 1);
    }
    @Test
    void Repeat() {
        for ( int i = 0; i < 100000; i++) {
            twoPlusTwoShouldEqualFour();
            twoMinusTwoShouldEqualZero();
            twoTimesTwoShouldEqualFour();
            twoDivideTwoShouldEqualOne();
        }
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