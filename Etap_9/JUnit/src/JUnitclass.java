import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value= Parameterized.class)
public class JUnitclass{
    int n;
    public JUnitclass (int num){
        this.n=num;
    }

    @Parameterized.Parameters
    public static Iterable<Object []> data(){
        Object[][] objectArray =new Object[][] {{1},{2},{3}};
        return Arrays.asList(objectArray);
    }
    @Test
    public void Junittst(){
        System.out.println("Multiples of 2 are :"+ 2*n);
    }
}