import data.StaticProvider;
import data.StaticProviderDouble;
import data.StaticProviderInt;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorkTestNG extends BaseTest {

    @Test
    public void divInt1() {
        int expectedValue = 5;//ожидаемый рез
        int actualValue = calculator.divInteger(10, 2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }
    @Test
    public void divDouble1() {
        double expectedValue = 5;//ожидаемый рез
        double actualValue = calculator.divIDouble(10.1, 2.2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }

    @Test(enabled = false)
    public void divInt2() {
        int expectedValue = 5;//ожидаемый рез
        int actualValue = calculator.divInteger(10, 2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }
    @Test(enabled = false)
    public void divDouble2 () {
        double expectedValue = 5;//ожидаемый рез
        double actualValue = calculator.divIDouble(10.1, 2.2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }

    @Test(description = "Тест с описанием")//ОПИСАНИЕ В ОТЧЕТАХ
    public void divInt3() {
        int expectedValue = 5;//ожидаемый рез
        int actualValue = calculator.divInteger(10, 2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }
    @Test(description = "Тест с описанием")//ОПИСАНИЕ В ОТЧЕТАХ
    public void divDouble3() {
        double expectedValue = 5;//ожидаемый рез
        double actualValue = calculator.divIDouble(10.1, 2.2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }

    @Test(testName = "Int test with name ")//заменит название теста в коде на то что в ковычках
    public void divInt4() {
        int expectedValue = 5;//ожидаемый рез
        int actualValue = calculator.divInteger(10, 2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }
    @Test(testName = "Double test with name")//заменит нащвание теста в коде на то что в ковычках
    public void divDouble4() {
        double expectedValue = 5;//ожидаемый рез
        double actualValue = calculator.divIDouble(10.1, 2.2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }

    @Test(timeOut = 1000)//если тест не выполнился за указанное время - то считается упавшим(в милисекундах)
    public void divInt5Wait() throws InterruptedException {
        Thread.sleep(100);
        int expectedValue = 5;//ожидаемый рез
        int actualValue = calculator.divInteger(10, 2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }
    @Test(timeOut = 1000)//если тест не выполнился за указанное время - то считается упавшим(в милисекундах)
    public void divDouble5Wait() throws InterruptedException {
        Thread.sleep(1000);
        double expectedValue = 5;//ожидаемый рез
        double actualValue = calculator.divIDouble(10.1, 2.2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }

    @Test(invocationCount = 6, invocationTimeOut = 1000, threadPoolSize = 2)//invocationCount - сколько раз запустить,
    // invocationTimeOut - ограничение времени за которое выполн все наши случаи(в нашем случае 3,
    //threadPoolSize - разбивает выполнение на потоки
    public void invocationIntTest() throws InterruptedException {
        Thread.sleep(1500);
        int expectedValue = 5;//ожидаемый рез
        int actualValue = calculator.divInteger(10, 2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками

    }
    @Test(invocationCount = 10, invocationTimeOut = 1000, threadPoolSize = 2)//invocationCount - сколько раз запустить,
    // invocationTimeOut - ограничение времени за которое выполн все наши случаи(в нашем случае 3,
    //threadPoolSize - разбивает выполнение на потоки
    public void invocationDoubleTest() throws InterruptedException {
        Thread.sleep(1500);
        double expectedValue = 5;//ожидаемый рез
        double actualValue = calculator.divIDouble(10.1, 2.2);

        Assert.assertEquals(actualValue, expectedValue, "Значения не одинаковые");//спец класс с проверками
    }

    @Test(priority = 1, expectedExceptions = NullPointerException.class)
    public void exceptionTest() {
        try {
            double result = calculator.divIDouble(3.2, 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void exceptionTest_1() {
        try {
            int result = calculator.divInteger(6, 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
    @Test (dataProvider = "Data for calculator int test", dataProviderClass = StaticProviderInt.class)
    public void DataCalcInt (int a, int b, int expectedValue) {
        Assert.assertEquals(calculator.divInteger(a, b), expectedValue, "Значения не одинаковые");
    }

    @Test (dataProvider = "Data for calculator double test", dataProviderClass = StaticProviderDouble.class )
    public void DataCalcDouble (double  a, double b, int expectedValue) {
        Assert.assertEquals(calculator.divIDouble(a, b), expectedValue, "Значения не одинаковые");
    }
}
