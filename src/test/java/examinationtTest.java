import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;
//change
public class examinationtTest {
    @Test(description = "проверки двух значений")
    public void testmake(){
        Integer result= Main.make1(4,5);
        Assert.assertEquals(result,9);
    }
    @Test(description = "проверки двух значений")
    public void testSubsract(){
        Integer result= Main.subtract(10,5);
        Assert.assertEquals(result,5,"ну чт0");
    }
    @Test(description = "проверки двух значений")
    public void testDivide(){
        Integer result= Main.divide(10,5);
        Assert.assertEquals(result,2,"ну что");
    }
    @Test(description = "проверки двух значений")
    public void testMultiply(){
        Integer result= Main.multiply(10,5);
        Assert.assertEquals(result,50,"what");
    }
}
