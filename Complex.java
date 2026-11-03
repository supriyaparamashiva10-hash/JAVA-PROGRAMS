public class Complex
{
    double real;
    double imaginary;
    Complex(double r, double i)
    {
        real = r ;
        imaginary = i;
    }
    Complex add(Complex c)
    {
        return new Complex(real+c.real,imaginary+c.imaginary);
    }

    Complex multiply(Complex c)
    {
       double r = real*c.real-imaginary*c.imaginary;
       double i = real*c.imaginary+imaginary*c.real;
       return new Complex(r,i);
    }
    void compareMagnitude(Complex c)
    {
        double m1=Math.sqrt(real*real+imaginary*imaginary);
        double m2=Math.sqrt(c.real*c.real+c.imaginary*c.imaginary);
        if(m1>m2)
            System.out.println("frist number is greater");
        else if(m1<m2)
            System.out.println("second number is greater");
        else
            System.out.println("both are equal");
    }
    Complex copy()
    {
        return new Complex(real,imaginary);
    }
    void display()
    {
        System.out.println(real+"+"+imaginary+"i");
    }
    public static void main(String[]args)
    {
        Complex c1 = new Complex(4,3);
        Complex c2 = new Complex(2,5);
        System.out.print("frist number:");
        c1.display();
        System.out.print("second number:");
        c2.display();
        Complex sum = c1.add(c2);
        System.out.print("addition:");
        sum.display();
        Complex product = c1.multiply(c2);
        System.out.print("multiplication:");
        product.display();
        c1.compareMagnitude(c2);
        Complex c3 = c1.copy();
        c1.real=10;
        System.out.print("modified frist number:");
        c1.display();
        System.out.print("modified second number:");
        c3.display();
    }

}
