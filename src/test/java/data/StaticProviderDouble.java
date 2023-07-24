package data;

import org.testng.annotations.DataProvider;

public class StaticProviderDouble {

    @DataProvider (name = "Data for calculator double test", parallel = true)
    public static Object[][] DataCalcDouble() {
        return new Object[][]{
                {28.2, 28.2, 1},//массив значений которые будут подставляться в тест. Значения подставятся в парарметры, объявленные в методе
                {9.3, 3.1, 3},
                {-6.2, -6.2, 1}

        };
    }

}