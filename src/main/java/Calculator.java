public class Calculator {
    private String level;

    public int sum(int a, int b) {
        return a + b;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    //HOMEWORK
    public double divIDouble (double a, double b)
    {
        if (b==0)
        {
            throw new NullPointerException("Impossible to divide by zero!");//выкидываем эксепшн
        }
        return a / b;
    }

    public int divInteger (int a, int b)
    {
        if (b == 0)
        {
            throw new NullPointerException("Impossible to divide by zero");
        }
        return a / b;
    }
}