import hw_lesson6.ArrayFind;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,2}, new int[]{1,2,4,4,2,3,4,1,7}},
                {new int[]{1,2}, new int[]{1,2,0,0,2,3,0,1,7}},
                {new int[]{1,2}, new int[]{1,2,4,4,2,3,0,1,7}},
                {new int[]{0,2,3,0,1,7}, new int[]{1,2,4,0,2,3,0,1,7}},
        });
    }

    private int[] num1;
    private int[]num2;
    private ArrayFind finds;

    public Test2(int[]num1, int [] num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    @Before
    public void init(){
        finds = new ArrayFind();
    }

    @Test
    public void testTestFind(){
        Assert.assertTrue("Массив не равен ", Arrays.equals(num1,finds.getPartOfArray(num2)));
    }
}
