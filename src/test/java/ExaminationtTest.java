import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.*;

//changeeee
public class ExaminationtTest {
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }
    @BeforeGroups(groups = {"first group"})
    public void beforeGroups(){
        System.out.println("before groups");

    }
    @Test(description = "негатив",groups = {"first group"},expectedExceptions =ArithmeticException.class,expectedExceptionsMessageRegExp ="/ by zero")
    public void negativeTestExcepcion(){
        Main.divide(-10, 0);
        System.out.println("negavite");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("after Class");

    }
    @AfterGroups(groups = {"first group"})
    public void afterGroups(){
        System.out.println("after Groups");

   }
    @Test(description = "проверки двух значений")
    public void testmake() {
        Integer result = Main.make(4, 5);
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
        Integer result = Main.make(-4, -5);
        Assert.assertEquals(result, -9);
    }
    @Test(description = "проверки двух значений")
    public void testmakeNegativePositive() {
        Integer result = Main.make(-4, 5);
        Assert.assertEquals(result, 1);
    }
    @Test(description = "проверки двух значений")
    public void testmakeZero() {
        Integer result = Main.make(-4, 0);
        Assert.assertEquals(result, -4);
    }
    @Test(description ="работа с провайдером",dataProvider = "testProvider")
    public  void testProviderMake(Integer q,Integer w,Integer e){
        Integer result = Main.make(q, w);
        Assert.assertEquals(result, e,"проверь еще раз");

    }
    @DataProvider
    public Object[][] testProvider(){
        return  new Object[][]{
                {1,2,3},
                {0,2,2},
                {-4,4,0}
        };
    }



}
