import org.junit.Assert;
import org.junit.Test;

public class MainClassTest   {
    @Test
    public void testGetLocalNumber(){
        MainClass Main=new MainClass();
        Assert.assertTrue("Value is not 14 ", Main.getLocalNumber()==14);
    }
}
