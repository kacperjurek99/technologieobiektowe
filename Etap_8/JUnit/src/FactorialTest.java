import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class FactorialTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0,1}, {1,1}, {2,2}, {3,6}, {4, 24}, {5, 120}
                , {6, 720}, {7, 5040}, {8, 40320}, {9, 362880}, {10, 3628800}
        });
    }
    private int input;
    private int expected;

    public FactorialTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }
    @Test
    public void testFactorialFunctionUsingParameterizedTests() {
        assertEquals(Factorial.compute(input), expected);
    }
}
