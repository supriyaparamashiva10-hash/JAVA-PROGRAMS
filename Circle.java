public class Circle
{
    double radius;
    void calculatearea()
    {
        double area = Math.PI * radius*radius;
        System.out.println("area of circle =" + area);
    }
    void calculatecircumference()
    {
        double circumference = 2*Math.PI*radius;
        System.out.println("circumference of Cirlce ="+circumference);
    }
    public static void main(String[]args)
    {
        Circle C = new Circle();
        C.radius =5;
        C.calculatearea();
        C.calculatecircumference();

    }

}
