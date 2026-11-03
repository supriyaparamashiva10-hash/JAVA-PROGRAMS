
public class Calculator
{
    int calculate(int a, int b)
    {
        return a + b;
    }
    double calculate(double a, double b)
    {
        return a * b;
    }
    int calculate(int a, int b, int c)
    {
        return Math.max(a, Math.max(b, c));
    }
    double calculate(int a, double b)
    {
        return a - b;
    }
    public static void main(String[]args)
    {
        Calculator  calc=new Calculator();
        System.out.println("sum:" + calc.calculate(10,20));
        System.out.println("product:"+calc.calculate(2.5,4.0));
        System.out.println("largest number:"+ calc.calculate(15,25,10));
        System.out.println("difference:"+calc.calculate(10,3.5));
    }
}
