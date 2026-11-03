public class Vehicle
{
    Vehicle()
    {
        System.out.println("Vehicle constructor");
    }
}
class car extends Vehicle
{
    car()
    {
        super();
        System.out.println("car constructor");
    }
    public static void main(String[]args)
    {
        car c = new car();
    }
}
