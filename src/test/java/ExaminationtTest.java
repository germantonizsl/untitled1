import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//changeeee
public class ExaminationtTest {
    @Test(description = "проверки двух значений")
    public void testmake() {
        Integer result = Main.make1(4, 5);
        Assert.assertEquals(result, 9);
    }

    @Test(description = "проверки двух значений")
    public void testSubsract() {
        Integer result = Main.subtract(10, 5);
        Assert.assertEquals(result, 5, "ну чт0");
    }

    @Test(description = "проверки двух значений")
    public void testDivide() {
        Integer result = Main.divide(10, 5);
        Assert.assertEquals(result, 2, "ну что");
    }

    @Test(description = "проверки двух значений")
    public void testMultiply() {
        Integer result = Main.multiply(10, 5);
        Assert.assertEquals(result, 50, "what");
    }

    @Test(description = "проверки двух значений")
    public void testMultiplyEqvivalentnegat() {
        Integer result = Main.multiply(-10, -5);
        Assert.assertEquals(result, 50, "what");
    }
    @Test(description = "проверки двух значений")
    public void testMultiplyEqvivalentNegatPositive() {
        Integer result = Main.multiply(-10, 5);
        Assert.assertEquals(result, -50, "what");
    }
    @Test(description = "проверки двух значений")
    public void testMultiplyEqvivalentZero() {
        Integer result = Main.multiply(-10, 0);
        Assert.assertEquals(result, 0, "what");
    }
    @Test(description = "проверки двух значений")
    public void testDivideNegative() {
        Integer result = Main.divide(-10, -5);
        Assert.assertEquals(result, 2, "ну что");
    }
    @Test(description = "проверки двух значений")
    public void testDivideNegativePositive() {
        Integer result = Main.divide(-10, 5);
        Assert.assertEquals(result, -2, "ну что");
    }
    @Test(description = "проверки двух значений",expectedExceptions =ArithmeticException.class,expectedExceptionsMessageRegExp ="/ by zero" )
    public void testDivideZero() {
      Main.divide(-10, 0);

    }

    @Test(description = "проверки двух значений")
    public void testSubsractNegative() {
        Integer result = Main.subtract(-10, -5);
        Assert.assertEquals(result, -5, "ну чт0");
    }
    @Test(description = "проверки двух значений")
    public void testSubsractNegativePositive() {
        Integer result = Main.subtract(-10, 5);
        Assert.assertEquals(result, -15, "ну чт0");
    }
    @Test(description = "проверки двух значений")
    public void testSubsractZero() {
        Integer result = Main.subtract(-10, 0);
        Assert.assertEquals(result, -10, "ну чт0");
    }
    @Test(description = "проверки двух значений")
    public void testmakeNegative() {
        Integer result = Main.make1(-4, -5);
        Assert.assertEquals(result, -9);
    }
    @Test(description = "проверки двух значений")
    public void testmakeNegativePositive() {
        Integer result = Main.make1(-4, 5);
        Assert.assertEquals(result, 1);
    }
    @Test(description = "проверки двух значений")
    public void testmakeZero() {
        Integer result = Main.make1(-4, 0);
        Assert.assertEquals(result, -4);
    }
    @Test(description ="работа с провайдером",dataProvider = "testProvider")
    public  void testProviderMake(Integer q,Integer w){
        Main.make1(q, w);

    }
    @DataProvider
    public Object[][] testProvider(){
        return  new Object[][]{
                {1,2},
                {0,2},
                {-4,4}
        };
    }



}
