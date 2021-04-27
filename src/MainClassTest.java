import org.junit.Assert;
import org.junit.Test;

public class MainClassTest   {
    @Test
    public void testGetClassString(){
        MainClass Main=new MainClass();
        Assert.assertTrue("String class_string has no text 'Hello' or 'hello' ", Main.getClassString().contains("hello") || Main.getClassString().contains("Hello"));
    }
}


