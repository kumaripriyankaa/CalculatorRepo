import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {

    @Test
        public void shouldGetLengthOfTheString()
    {
        String testString = "GoodLuck for new journey" ;
        Assert.assertEquals(testString.length(),24);
    }
}
