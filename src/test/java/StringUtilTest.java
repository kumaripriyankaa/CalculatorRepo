import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {

    @Test
        public void shouldGetLengthOfTheString()
    {
        new Calculator();
        int length = "GoodLuck for new journey".length();

        Assert.assertEquals(length,24);
    }

    @Test
        public void shouldAddTwoNumbers()

    {
        int sum = new Calculator().getResultOfAddition(10,20);

        Assert.assertEquals(sum,30);
    }


    @Test
    public  void shouldMultiplyTwoNumbers() {
        int result = new Calculator().getResultOfMultiplication(40,5);

        Assert.assertEquals(result,200);
    }


}
