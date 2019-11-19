import org.junit.*;

public class CarCalculatorTests
{

    CarCalculator myCarCalculator = new CarCalculator();

    @Before
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }

    @After
    public void afterEachTest() {
        System.out.println("This is exceuted after each Test");
    }


    @Test
    public void loanInterestRateForAmountNotLessThanTenThousand()
    {
        // CarCalculator myCarCalculator = new CarCalculator();
        Assert.assertEquals(0.10, myCarCalculator.loanInterestRate(10000.00),0.00);
    }

    @Test
    public void loanInterestRateForAmountLessThanTenThousand()
    {
        // CarCalculator myCarCalculator = new CarCalculator();
        Assert.assertEquals(0.06, myCarCalculator.loanInterestRate(5000),0.00);
    }

    @Test
    public void downPaymentAmountForAmountNotLessThanTenThousand()
    {
        // CarCalculator myCarCalculator = new CarCalculator();
        Assert.assertEquals(2000, myCarCalculator.downPaymentAmount(10000.00),0.00);
    }

    @Test
    public void downPaymentAmountForAmountLessThanTenThousand()
    {
        // CarCalculator myCarCalculator = new CarCalculator();
        Assert.assertEquals(500, myCarCalculator.downPaymentAmount(5000),0.00);
    }

    @Test
    public void repaymentAmount()
    {
        // CarCalculator myCarCalculator = new CarCalculator();
        Assert.assertEquals(128, myCarCalculator.repaymentAmount(5000, 3),0.00);
    }
}
