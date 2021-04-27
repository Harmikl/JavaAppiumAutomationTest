import org.junit.Assert;
import org.junit.Test;

public class MainClassTest   {
    @Test
    public void testGetClassNumber(){
        MainClass Main=new MainClass();
        Assert.assertTrue("Value is not more than 45 ", Main.getClassNumber()>45);
    }
}
