import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public final class MathTests {
    private Math math;

    @BeforeMethod
    public void setup() {
        math = new Math();
    }

    @Test
    public void given_two_plus_two_expect_four() {
        final int expected = 4;
        final int actual = math.add(2, 2);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void given_six_times_four_expect_twentyfour() {
        final int expected = 24;
        final int actual = math.multiply(6, 4);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void given_thirteen_times_zero_expect_zero() {
        final int expected = 0;
        final int actual = math.multiply(13, 0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void given_ten_divided_by_five_expect_two() {
        final double expected = 2.0;
        final double actual = math.divide(10, 5);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void given_ten_divided_by_zero_expect_illegal_argument_exception() {
        math.divide(10, 0);
    }

    @AfterMethod
    public void tearDown() {
        math = null;
    }
}
