package data;
import org.testng.annotations.DataProvider;
public class StaticProviderInt {
    @DataProvider (name = "Data for calculator int test", parallel = true)
    public static Object[][] DataCalcInt() {
        return new Object[][]{
                {100, 5, 20},//массив значений которые будут подставляться в тест. Значения подставятся в парарметры, объявленные в методе
                {3, 0, 0},
                {0, 0, 0},
                {-125,-5, 25},

        };
    }

}