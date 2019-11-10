import hw_lesson6.ArrayFind;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test1 {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {true, new int[]{2,1,4,4,1,1}},
                {true, new int[]{4,4,4,4,4}},
                {true, new int[]{1,1}},
                {true, new int[]{1,1,4,4,4,4,1,1}},

        });
    }

    private ArrayFind ar;
    private boolean method;
    private int[] num2;

    public Test1(boolean method, int[] num2){
        this.method = method;
        this.num2 = num2;
    }
    @Before
    public void init(){
        ar = new ArrayFind();

    }

    @Test
    public void testArrayFind(){

        Assert.assertEquals(method,ar.checkArrayFor1And4(num2));
    }

}
