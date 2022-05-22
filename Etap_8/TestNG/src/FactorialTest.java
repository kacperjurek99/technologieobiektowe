import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.*;

import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @DataProvider(name = "numbers")
    public static Object[][] evenNumbers() {
        return new Object[][]{{1, false}, {2, true}, {4, true}};
    }
    @Test(dataProvider = "numbers")
    public void givenNumberFromDataProvider_ifEvenCheckOK_thenCorrect
            (Integer number, boolean expected) {
        Assert.assertEquals(expected, number % 2 == 0);
    }
}
