import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExaminationtTest {
    @Test(description = "проверки двух значений")
    public void testmake(){
        Integer result= Main.MAKE1(4,5);
        Assert.assertEquals(result,9);
    }
    @Test(description = "проверки двух значений")
    public void testsubsract(){
        Integer result= Main.subtract(10,5);
        Assert.assertEquals(result,5);
    }
    @Test(description = "проверки двух значений")
    public void testdivide(){
        Integer result= Main.divide(10,5);
        Assert.assertEquals(result,2);
    }
    @Test(description = "проверки двух значений")
    public void testmultiply(){
        Integer result= Main.multiply(10,5);
        Assert.assertEquals(result,50);
    }
}
