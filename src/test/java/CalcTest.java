import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CalcTest extends BaseTest {

    @Test
    public void sumTest_1() {
        int expectedValue = 5;//ожидаемый рез
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }

    @Test(enabled = false)
    public void sumTest_2() {
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(description = "Тест с описанием")//ОПИСАНИЕ В ОТЧЕТАХ
    public void sumTest_3() {
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(testName = "Test with name")//заменит нащвание теста в коде на то что в ковычках
    public void sumTest_4() {
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(timeOut = 1000)//если тест не выполнился за указанное время - то считается упавшим(в милисекундах)
    public void waitLongTimeTest() throws InterruptedException {
        Thread.sleep(1000);
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(invocationCount = 6, invocationTimeOut = 1000, threadPoolSize = 2)//invocationCount - сколько раз запустить,
    // invocationTimeOut - ограничение времени за которое выполн все наши случаи(в нашем случае 3,
    //threadPoolSize - разбивает выполнение на потоки
    public void invocationCountTest() throws InterruptedException {
        Thread.sleep(1500);
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void exceptionTest() {
        List list = null;
        int size = list.size();
    }

    @Test (dataProvider = "Data for Sum test", dataProviderClass = StaticProvider.class)
    public void dataProviderTest(int a, int b, int expectedValue) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(calculator.sum(a, b), expectedValue, "Значения не одинаковые");
    }
}